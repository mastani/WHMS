
package Classes;

/**
 *
 * @author Hassan
 */
public class Orders {
    
    //Fields:
    
    private int order_ID;
    private Date delivery_time;
    private Date order_time;
    
    //Constructors:
    
    Orders(){};
    Orders(int order_ID, Date delivery_time, Date order_time){
        
        this.order_ID = order_ID;
        this.delivery_time = delivery_time;
        this.order_time = order_time;
    }
    
    //Mutator(setter) Methods:
    
    public void setOrderID(int order_ID){
        
        if(order_ID > 0)
            this.order_ID = order_ID;
    }
    
    public void setDelivery_Time(Date delivery_time){
        
        this.delivery_time = delivery_time;
    }
    
    public void setOrder_Time(Date order_time){
        
        this.order_time = order_time;
    }
    
    //Accessor(getter) Methods:
    
    public int getOrderID(){
        
        return order_ID;
    }
    
    public Date getDelivery_Time(){
        
        return delivery_time;
    }
    
    public Date getOrder_Time(){
        
        return order_time;
    }
}
