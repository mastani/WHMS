
import Database.Database;
import UI.HomePageUI;
import UI.LoginUI;
import UI.WarehouseListUI;

public class Initialize {
    
    public static void main(String args[]) {
        Database.DB = new Database();
        LoginUI.main(args);
    }
}
