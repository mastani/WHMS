
package Classes;


public class Customer extends Person{
    
    //Fields:
    
    private int customer_ID;
    
    //Constructors:
    
    Customer(){};
    Customer(int customer_ID){
        
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
    
}
