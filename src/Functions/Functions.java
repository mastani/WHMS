package Functions;

public class Functions {
    
    public static String getTime() {
        return new java.text.SimpleDateFormat("HH:mm:ss").format(new java.util.Date(System.currentTimeMillis()));
    }
    
    //test
    
}
