
import Classes.*;
import Database.Database;
import UI.LoginUI;

public class Initialize {
    
    public static void main(String args[]) {
        Database.DB = new Database();
        
        // Inizialize Objects
        Warehouse.loadWarehouses();
        Customer.loadCustomers();
        Ware.loadWares();
        WarehouseKeeper.loadWarehouseKeeper();
        Orders.loadOrders();
        
        LoginUI.main(args);
    }
}
