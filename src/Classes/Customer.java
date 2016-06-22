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


public class Customer extends Person {
    
    public static Vector<Customer> CustomersHolder;
    
    //Fields:
    
    private int customer_ID;
    
    //Constructors:
    
    Customer(){};
    Customer(int ID, String firstName, String surName, Date birthDate, String cellNumber, String address, int customer_ID){
        super(ID, firstName, surName, birthDate, cellNumber, address);
        this.customer_ID = customer_ID;
    }
    
    //Mutator(setter) Methods:
    
    public void setCustomeID(int customer_ID){
        if (customer_ID > 0)
            this.customer_ID = customer_ID;
    }
    //Accessor(getter) Methods:
    
    public int getCustommerID(){
        
        return customer_ID;
    }
    
    public static void loadCustomers() {
        try {
            ResultSet rs = Database.DB.Query("SELECT * FROM person INNER JOIN customer ON person.person_ID = customer.customer_ID");
            CustomersHolder = new Vector<>(rs.getRow());
            Customer temp;
            while (rs.next()) {
                temp = new Customer(rs.getInt("person_ID"), rs.getString("first_name"), rs.getString("surname"), rs.getDate("birth_date"), rs.getString("cell_number"), rs.getString("address"), rs.getInt("customer_ID"));
                CustomersHolder.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomePageUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
    public static void insertCustomer(Customer customer) {
        int id = Queries.insertPersonQuery(customer);
        customer.setID(id);
        CustomersHolder.add(customer);
    }
    
    public static void deleteCustomer(int id) {
        Database.DB.simpleQuery("DELETE FROM customer WHERE customer_ID = " + id);
        
        for (Customer ps : CustomersHolder) {
            if( id == ps.getID()) {
                CustomersHolder.removeElement(ps);
                break;
            }
        }
    }
}
