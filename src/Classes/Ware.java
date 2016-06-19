
package Classes;


public class Ware {
    
    //Fields:
    
    private int ware_ID;
    private String ware_kind;
    private String ware_name;
    private int ware_price;
    private int width;
    private int length;
    
    enum kind {
        TYPE1,
        TYPE2,
        
    }
    
    //constructors:
    
    Ware(){};
    Ware(int ware_ID, String ware_kind, String ware_name, int ware_price, int width, int length){
        
        this.ware_ID = ware_ID;
        this.ware_kind = ware_kind;
        this.ware_name = ware_name;
        this.ware_price = ware_price;
        this.width = width;
        this.length = length;
                
    }
    
    public void setWareID(int ware_ID){
        if (ware_ID > 0)
            this.ware_ID = ware_ID;
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
      
      public void setWidth(int width){
        
         this.width = width;
    }
      
      public void setLength(int length){
        
         this.length = length;
    }
      
      //Accessor(getter) Methods:
      
      public int getWareID(){
          
          return ware_ID;
      }
      
      public String getWare_Kind(){
          
          return ware_kind;
      }
      
      public String getWare_Name(){
          
          return ware_name;
      }
      
      public float getWare_Price(){
          
          return ware_price;
      }
      
      public int getWidth(){
          
          return width;
      }
      
      public int getLength(){
          
          return length;
      }
      
}
