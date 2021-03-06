
package Classes;

import Database.*;
import UI.HomePageUI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Warehouse {

    public static Vector<Warehouse> WarehousesHolder;
    
    //Fields:
    
    private int warehouse_ID;
    private String name;
    private int state;
    
    //Constructor:
    
    Warehouse(){};

    public Warehouse(int warehouse_ID, String name, int state) {
        this.warehouse_ID = warehouse_ID;
        this.name = name;
        this.state = state;
    }
    
    //Mutator(setter) Methods:
    
    public void setWarehouseID(int warehouse_ID){
        if(warehouse_ID > 0)
            this.warehouse_ID = warehouse_ID;
    }
    
    //Accessor(getter) Methods:
    
    public int getWarehouse_ID(){
        return warehouse_ID;
    }
   
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setState(int state) {
        this.state = state;
    }
    
    public int getState() {
        return this.state;
    }
    
    public static void loadWarehouses() {
        try {
            ResultSet rs = Database.DB.Query("SELECT * FROM warehouse");
            WarehousesHolder = new Vector<>(rs.getRow());
            Warehouse temp;
            while (rs.next()) {
                temp = new Warehouse(rs.getInt("warehouse_ID"), rs.getString("name"), rs.getInt("state"));
                WarehousesHolder.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomePageUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String findWarehouse(int warehouse_ID) {
        String f_warehouse_ID = null;
        
        for (Warehouse wh : WarehousesHolder) {
            if( warehouse_ID == wh.getWarehouse_ID()) {
                f_warehouse_ID = wh.getName();
            }
        }
        
        return f_warehouse_ID;
    }
    
    public static int findWarehouse(String warehouse_Name) {
        int f_warehouse_ID = 0;
        
        for (Warehouse wh : WarehousesHolder) {
            if( warehouse_Name.equals(wh.getName()) ) {
                f_warehouse_ID = wh.getWarehouse_ID();
            }
        }
        
        return f_warehouse_ID;
    }
    
    public static void insertWarehouse(Warehouse warehouse) {
        int id = Queries.insertWarehouseQuery(warehouse);        
        warehouse.setWarehouseID(id);
        WarehousesHolder.add(warehouse);
    }
    
    public static boolean deleteWarehouse(int warehouse_ID) {
        Warehouse warehouse = null;
        
        for (Warehouse wh : WarehousesHolder) {
            if( warehouse_ID == wh.getWarehouse_ID()) {
                warehouse = wh;
                break;
            }
        }
        
        boolean check = Queries.checkWarehousIsEmpty(warehouse);
        
        if(check) {
            Queries.deleteWarehouseQuery(warehouse);
            WarehousesHolder.removeElement(warehouse);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "این انبار دارای کالا است. قبل از حذف انبار کالا های آن را حذف کنید!");
            return false;
        }
    }
    
}
