package Classes;

import Database.Database;
import Database.Queries;
import UI.HomePageUI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WarehouseKeeper extends Person {
    
    public static Vector<WarehouseKeeper> WarehouseKeeperHolder;
    
    //fields:
    
    private int personnel_code;
    private String password;
    
    //constructors:
    
    WarehouseKeeper(){};
    public WarehouseKeeper(int ID, String firstName, String surName, Date birthDate, String cellNumber, String address, int personnel_code, String password){
        super(ID, firstName, surName, birthDate, cellNumber, address);
        setPersonnelCode(personnel_code);
        setPassword(password);
    }
    
    //Mutator(setter) Methods :
    
    public void setPersonnelCode(int personnel_code){
        if(personnel_code > 0)
            this.personnel_code = personnel_code;
    }
   
    public void setPassword(String password){
        this.password = password;
    } 
    
    //Accessor(getter) Methods:
    
    public int getPersonnelCode(){
        return personnel_code;
    }
    
    public String getPassword(){
        return password;
    }
           
    public static void loadWarehouseKeeper() {
        try {
            ResultSet rs = Database.DB.Query("SELECT * FROM person INNER JOIN warehouse_keeper ON person.person_ID = warehouse_keeper.personnel_code");
            WarehouseKeeperHolder = new Vector<>(rs.getRow());
            WarehouseKeeper temp;
            while (rs.next()) {
                temp = new WarehouseKeeper(rs.getInt("person_ID"), rs.getString("first_name"), rs.getString("surname"), rs.getDate("birth_date"), rs.getString("cell_number"), rs.getString("address"), rs.getInt("personnel_code"), rs.getString("password"));
                WarehouseKeeperHolder.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomePageUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void deleteWarehouseKeeper(int personnel_code) {
        WarehouseKeeper warehouse_keeper = null;
        
        for (WarehouseKeeper wh : WarehouseKeeperHolder) {
            if( personnel_code == wh.getPersonnelCode()) {
                warehouse_keeper = wh;
                break;
            }
        }
        
        Queries.deleteWarehouseKeeper(warehouse_keeper);
        WarehouseKeeperHolder.removeElement(warehouse_keeper);
    }
}
