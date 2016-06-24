
package Classes;

import static Classes.Customer.CustomersHolder;
import static Classes.Ware.WaresHolder;
import Database.Database;
import Database.Queries;
import UI.HomePageUI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Orders {
    
    public static Vector<Orders> OrdersHolder;
    
    //Fields:
    
    private int order_ID;
    private Date order_time;
    private int customer_ID;
    private int personnel_code;
    
    //Constructors:
    
    Orders(){};
    public Orders(int order_ID, Date order_time, int customer_ID, int personnel_code){
        setOrderID(order_ID);
        setOrder_Time(order_time);
        setCustomer_ID(customer_ID);
        setPersonnel_code(personnel_code);
    }
    
    //Mutator(setter) Methods:
    
    public void setOrderID(int order_ID){
        if(order_ID > 0)
            this.order_ID = order_ID;
    }
    
    public void setOrder_Time(Date order_time){
        this.order_time = order_time;
    }
    
    public void setPersonnel_code(int personnel_code) {
        this.personnel_code = personnel_code;
    }
    
    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }
    
    //Accessor(getter) Methods:
    
    public int getOrderID(){
        return order_ID;
    }
    
    public Date getOrder_Time(){
        return order_time;
    }
    
    public int getPersonnel_code() {
        return this.personnel_code;
    }
    
    public int getCustomer_ID() {
        return this.customer_ID;
    }
    
    public static void loadOrders() {
        try {
            ResultSet rs = Database.DB.Query("SELECT * FROM orders");
            OrdersHolder = new Vector<>(rs.getRow());
            Orders temp;
            while (rs.next()) {
                temp = new Orders(rs.getInt("order_ID"), rs.getDate("order_time"), rs.getInt("customer_ID"), rs.getInt("personnel_code"));
                OrdersHolder.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomePageUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int insertOrder(Orders order) {
        int id = Queries.insertOrder(order);        
        order.setOrderID(id);
        OrdersHolder.add(order);
        
        return id;
    }
    
    public static void insertOrderWares(int order_ID, int ware_ID, int size) {
        Queries.insertOrderWare(order_ID, ware_ID, size);
    }
}
