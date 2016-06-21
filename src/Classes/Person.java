package Classes;

import static Classes.Warehouse.WarehousesHolder;
import Database.*;
import UI.HomePageUI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;


public class Person {
    
    public static Vector<Person> PersonsHolder;
    
    //fields:
    
    private int ID;
    private String firstName;
    private String surName;
    private Date birthDate;
    private String cellNumber;
    private String address;
    private int customer_ID;
    private int personnel_code;
    
    //Constructors :
    
    Person(){};
    Person(int ID, String firstName, String surName, Date birthDate, String cellNumber, String address, int customer_ID, int personnel_code){
        setID(ID);
        setName(firstName);
        setSurName(surName);
        setBirthDate(birthDate);
        setCellNumber(cellNumber);
        setAddress(address);
        setCustomer_ID(customer_ID);
        setPersonnel_code(personnel_code);
    } 
    
    //Mutator(setter) Methods: 
    
    public void setID(int ID){
        if(ID > 0)
            this.ID = ID;
    }
    
     public void setName(String firstName){
        if (firstName.length() <= 30)
            this.firstName = firstName;
        else
            this.firstName = firstName.substring(0, 30);
    } 
        
       
     public void setSurName(String surName){
         if (surName.length() <= 40)
            this.surName = surName;
        else
            this.surName = surName.substring(0, 40);
        
    }        
     
     public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
    }
     
     public void setCellNumber(String cellNumber){
         if (cellNumber.length() == 11)
             this.cellNumber = cellNumber;
         else 
             JOptionPane.showMessageDialog(null, "Please enter a cellNumber in 11 digits : ");
     
    }
     
     public void setAddress(String address){
        this.address = address;
    }
     
     public void setCustomer_ID(int customer_ID) {
         this.customer_ID = customer_ID;
     }
     
     public void setPersonnel_code(int personnel_code) {
         this.personnel_code = personnel_code;
     }
     
     //Accessor(getter) Methods:
     
     public int getID(){
         return ID;
     }
     
      public String getName(){
         return firstName;
     }
      
      public String getSurName(){
          return surName;
      }
      
      public Date getBirthDate(){
          return birthDate;
      }
      
      public String getCellNumber(){
          return cellNumber;
      }
      
      public String getAddress(){
          return address;
      }
      
      public int getCustomer_ID() {
          return this.customer_ID;
      }
      
      public int getPersonnel_code() {
          return this.personnel_code;
      }
      
      public static void loadPersons() {
        try {
            ResultSet rs = Database.DB.Query("SELECT * FROM person");
            PersonsHolder = new Vector<>(rs.getRow());
            Person temp;
            while (rs.next()) {
                temp = new Person(rs.getInt("ID"), rs.getString("first_name"), rs.getString("surname"), rs.getDate("birth_date"), rs.getString("cell_number"), rs.getString("address"), rs.getInt("customer_ID"), rs.getInt("personnel_code"));
                PersonsHolder.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomePageUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
    public static void insertPerson(Person person) {
        int id = Queries.insertPersonQuery(person);
        person.setID(id);
        PersonsHolder.add(person);
    }
    
    public static void deletePerson(int id) {
        Database.DB.simpleQuery("DELETE FROM person WHERE ID = " + id);
        
        for (Person ps : PersonsHolder) {
            if( id == ps.getID()) {
                PersonsHolder.removeElement(ps);
                break;
            }
        }
    }
}
