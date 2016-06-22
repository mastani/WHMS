package Database;

import Classes.Person;
import Classes.Warehouse;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Functions.Functions;
import java.sql.Statement;
import java.util.Date;

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
    
    public static int registerAccount(String first_name, String surname, Date birth_date, String cell_number, String address, String password) {
        int person_ID = insertPerson(first_name, surname, birth_date, cell_number, address);
                
        try {
            PreparedStatement ps = Database.conn.prepareStatement("INSERT INTO warehouse_keeper (personnel_code, password) VALUES (?, MD5(?))");
            ps.setInt(1, person_ID);
            ps.setString(2, password);
            
            int result = ps.executeUpdate();
            
            if(result != 0)
                return person_ID;
            
            ps.close();          
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
    
    public static int insertPerson(String first_name, String surname, Date birth_date, String cell_number, String address) {
        int id = 0;
        
        try {
            PreparedStatement ps = Database.conn.prepareStatement("INSERT INTO person (first_name, surname, birth_date, cell_number, address) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, first_name);
            ps.setString(2, surname);
            ps.setDate(3, Functions.convertFromJAVADateToSQLDate(birth_date));
            ps.setString(4, cell_number);
            ps.setString(5, address);
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return id;
    }
    
    public static int insertWarehouseQuery(Warehouse warehouse) {
        int id = Database.DB.QueryWithID("INSERT INTO warehouse (name, state) VALUES (\"" + warehouse.getName() + "\", " + String.valueOf(warehouse.getState()) + ")");
        return id;
    }
    
    public static void deleteWarehouseQuery(Warehouse warehouse) {
        Database.DB.simpleQuery("DELETE FROM warehouse WHERE warehouse_ID = " + warehouse.getWarehouse_ID());
    }
    
    public static int insertPersonQuery(Person person) {
        int person_id = insertPerson(person.getName(), person.getSurName(), person.getBirthDate(), person.getCellNumber(), person.getAddress());
        return 0;
    }
}
