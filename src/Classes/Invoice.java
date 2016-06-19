
package Classes;


public class Invoice {
    
    //Fields:
    
    private int invoice_ID;
    
    //Constructor:

    Invoice() { };

    public Invoice(int invoice_ID) {
        
        this.invoice_ID = invoice_ID;
    }
    
    //Mutator(setter)Method(s):
    
    public void setInvoiceID(int invoice_ID){
        
        if(invoice_ID > 0)
            this.invoice_ID = invoice_ID; 
    }
    
    //Accessor(getter)Method(s):
    
    public int getInvoice_ID(){
        
        return invoice_ID;
    }
    
    
    
    
  
    
    
}
