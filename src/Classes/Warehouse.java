
package Classes;

/**
 *
 * @author Hassan
 */

public class Warehouse {

    //Fields:
    
    private int warehouse_ID;
    
    //Constructor:
    
    Warehouse(){};

    Warehouse(int warehouse_ID) {
        this.warehouse_ID = warehouse_ID;
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
   
    
    
}
