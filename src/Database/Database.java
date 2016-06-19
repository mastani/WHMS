package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    public static Database DB = null;
    Connection conn;
    
    @SuppressWarnings("UseSpecificCatch")
    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/whms", "root", "");
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet Query(String query) {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public String StringQuery(String query) {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            return rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean validateLogin(String username, String password) {
        boolean success = false;
        
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT COUNT(*) FROM users WHERE username = ? AND password = MD5(?)");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            if(rs.getInt(1) == 1)
                success = true;
            
            rs.close();
            ps.close();          
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return success;
    }
    
    public boolean registerAccount(String username, String password) {
        boolean success = false;
        
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO users (username, password) VALUES (?, MD5(?))");
            ps.setString(1, username);
            ps.setString(2, password);
            
            int result = ps.executeUpdate();
            
            if(result != 0)
                success = true;
            
            ps.close();          
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return success;
    }
}
