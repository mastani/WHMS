
import Classes.Customer;
import Classes.Ware;
import Classes.Warehouse;
import Database.Database;
import UI.LoginUI;

public class Initialize {
    
    public static void main(String args[]) {
        Database.DB = new Database();
        
        // Inizialize Objects
        Warehouse.loadWarehouses();
        Customer.loadCustomers();
        Ware.loadWares();
        
        LoginUI.main(args);
    }
}
