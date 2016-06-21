
package Classes;

import Functions.Date1;


public class Orders {
    
    //Fields:
    
    private int order_ID;
    private Date1 delivery_time;
    private Date1 order_time;
    
    //Constructors:
    
    Orders(){};
    Orders(int order_ID, Date1 delivery_time, Date1 order_time){
        
        this.order_ID = order_ID;
        this.delivery_time = delivery_time;
        this.order_time = order_time;
    }
    
    //Mutator(setter) Methods:
    
    public void setOrderID(int order_ID){
        
        if(order_ID > 0)
            this.order_ID = order_ID;
    }
    
    public void setDelivery_Time(Date1 delivery_time){
        
        this.delivery_time = delivery_time;
    }
    
    public void setOrder_Time(Date1 order_time){
        
        this.order_time = order_time;
    }
    
    //Accessor(getter) Methods:
    
    public int getOrderID(){
        
        return order_ID;
    }
    
    public Date1 getDelivery_Time(){
        
        return delivery_time;
    }
    
    public Date1 getOrder_Time(){
        
        return order_time;
    }
}
