package Database;

import Classes.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Functions.Functions;
import static Functions.Functions.*;
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
    
    public static boolean checkWarehousIsEmpty(Warehouse warehouse) {
        boolean success = true;
        
        try {
            PreparedStatement ps = Database.DB.conn.prepareStatement("SELECT COUNT(*) FROM ware WHERE warehouse_ID = ?");
            ps.setInt(1, warehouse.getWarehouse_ID());
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            if(rs.getInt(1) > 0)
                success = false;
            
            rs.close();
            ps.close();          
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return success;
    }
    
    public static int insertCustomerQuery(Customer customer) {
        int person_id = insertPerson(customer.getName(), customer.getSurName(), customer.getBirthDate(), customer.getCellNumber(), customer.getAddress());
        Database.DB.QueryWithID("INSERT INTO customer (customer_ID) VALUES (" + person_id + ")");
        return person_id;
    }
    
    public static int insertWare(Ware ware) {
        int id = 0;
        
        try {
            PreparedStatement ps = Database.conn.prepareStatement("INSERT INTO ware (warehouse_ID, ware_kind, ware_name, ware_price, ware_size) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ware.getWarehouseID());
            ps.setString(2, ware.getWare_Kind());
            ps.setString(3, ware.getWare_Name());
            ps.setInt(4, ware.getWare_Price());
            ps.setInt(5, ware.getWare_Size());
            
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
    
    public static void deleteWareQuery(Ware ware) {
        Database.DB.simpleQuery("DELETE FROM ware WHERE ware_ID = " + ware.getWareID());
    }
    
    public static void deleteWarehouseKeeper(WarehouseKeeper warehouse_keeper) {
        Database.DB.simpleQuery("DELETE FROM warehouse_keeper WHERE personnel_code = " + warehouse_keeper.getPersonnelCode());
    }
    
    public static int insertOrder(Orders order) {
        int id = 0;
        
        try {
            PreparedStatement ps = Database.conn.prepareStatement("INSERT INTO orders (order_time, customer_ID, personnel_code) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, convertFromJAVADateToSQLDate(order.getOrder_Time()));
            ps.setInt(2, order.getCustomer_ID());
            ps.setInt(3, order.getPersonnel_code());
            
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
    
    public static int insertOrderWare(int order_ID, int ware_ID, int size) {
        int id = 0;
        
        try {
            PreparedStatement ps = Database.conn.prepareStatement("INSERT INTO wares_in_order (order_ID, ware_ID, num_of_ware) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, order_ID);
            ps.setInt(2, ware_ID);
            ps.setInt(3, size);
            
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
}
