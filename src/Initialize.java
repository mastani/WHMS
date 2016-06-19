
import Database.Database;
import UI.LoginUI;

public class Initialize {
    
    public static void main(String args[]) {
        Database.DB = new Database();
        LoginUI.main(args);
    }
}
