package Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Queries {
    
    public static boolean validateLogin(String username, String password) {
        boolean success = false;
        
        try {
            PreparedStatement ps = Database.DB.conn.prepareStatement("SELECT COUNT(*) FROM warehouse_keeper WHERE personnel_code = ? AND password = MD5(?)");
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
    
    public static boolean registerAccount(String username, String password) {
        boolean success = false;
        
        try {
            PreparedStatement ps = Database.DB.conn.prepareStatement("INSERT INTO warehouse_keeper (personnel_code, password) VALUES (?, MD5(?))");
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
