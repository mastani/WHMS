package Classes;

import Database.Database;
import Database.Queries;
import UI.HomePageUI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ware {
    
    public static Vector<Ware> WaresHolder;
    
    //Fields:
    
    private int ware_ID;
    private int warehouse_ID;
    private String ware_kind;
    private String ware_name;
    private int ware_price;
    private int ware_size;
    
    //constructors:
    
    Ware(){};
    public Ware(int ware_ID, int warehouse_ID, String ware_kind, String ware_name, int ware_price, int ware_size){
        setWareID(ware_ID);
        setWarehouseID(warehouse_ID);
        setWare_Kind(ware_kind);
        setWare_Name(ware_name);
        setWare_Price(ware_price);
        setWareSize(ware_size);
    }
    
    public void setWareID(int ware_ID){
        if (ware_ID > 0)
            this.ware_ID = ware_ID;
    }
    
    public void setWarehouseID(int warehouse_ID) {
        if (warehouse_ID > 0)
            this.warehouse_ID = warehouse_ID;
    }
    
    public void setWare_Kind(String ware_kind){
        if (ware_kind.length() <= 40)
            this.ware_kind = ware_kind;
        else
            this.ware_kind = ware_kind.substring(0, 40);
         
    }
    
    public void setWare_Name(String ware_name){
        if (ware_name.length() <= 40)
            this.ware_name = ware_name;
        else
            this.ware_name = ware_name.substring(0, 40);
    }
     
    public void setWare_Price(int ware_price){
        if(ware_price > 0)  
         this.ware_price = ware_price;
    }
      
    public void setWareSize(int ware_size){
        if (ware_size > 0)
            this.ware_size = ware_size;
    }
      
      //Accessor(getter) Methods:
      
      public int getWareID(){
          return ware_ID;
      }
      
      public int getWarehouseID() {
          return this.warehouse_ID;
      }
      
      public String getWare_Kind(){
          return ware_kind;
      }
      
      public String getWare_Name(){
          return ware_name;
      }
      
      public int getWare_Price(){
          return ware_price;
      }
      
      public int getWare_Size(){
          return ware_size;
      }
      
      public static void loadWares() {
        try {
            ResultSet rs = Database.DB.Query("SELECT * FROM ware");
            WaresHolder = new Vector<>(rs.getRow());
            Ware temp;
            while (rs.next()) {
                temp = new Ware(rs.getInt("ware_ID"), rs.getInt("warehouse_ID"), rs.getString("ware_kind"), rs.getString("ware_name"), rs.getInt("ware_price"), rs.getInt("ware_size"));
                WaresHolder.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomePageUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void insertWare(Ware ware) {
        int id = Queries.insertWare(ware);        
        ware.setWareID(id);
        WaresHolder.add(ware);
    }
    
    public static void deleteWare(int ware_ID) {
        Ware ware = null;
        
        for (Ware wh : WaresHolder) {
            if( ware_ID == wh.getWareID()) {
                ware = wh;
                break;
            }
        }
        
        Queries.deleteWareQuery(ware);
        WaresHolder.removeElement(ware);
    }
    
    public static Vector<Ware> findWare(String findStr) {
        Vector<Ware> temp = new Vector<>(1);
        
        for (Ware wh : WaresHolder) {
            if( wh.getWare_Name().contains(findStr) ) {
                temp.add(wh);
            }
        }
        
        return temp;
    }
}
