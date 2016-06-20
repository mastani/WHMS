
import Database.Database;
import UI.HomePageUI;
import UI.LoginUI;

public class Initialize {
    
    public static void main(String args[]) {
        Database.DB = new Database();
        HomePageUI.main(args);
    }
}
