
package Functions;

import javax.swing.JOptionPane;


public class Date {
    
    private final  int month; // 1-12
    private final  int day; // 1-31 based on month
    private  int year; // any year
 
    private static final int[] daysPerMonth = // days in each month
        { 0, 31, 31, 31, 31, 31, 31, 30, 30, 30, 30, 30, 29 };


    public Date( int theMonth, int theDay, int theYear )
    {
    month = checkMonth( theMonth ); // validate month
    year = theYear; // could validate year
    day = checkDay( theDay ); // validate day

    } // end Date constructor

 
    private int checkMonth( int testMonth )
    {
    if ( testMonth > 0 && testMonth <= 12 ) // validate month
    return testMonth;
    
    else // month is invalid
    JOptionPane.showMessageDialog(null, "Please enter a valid month between 1-12 : ");
     return 0;
 } // end method checkMonth

 
     private int checkDay( int testDay )
 {
    //  check if day in range for month
    if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
        return testDay;
    return 0;
      
 }

     public void setYear(int year){
         
         this.year = year >= 1300 && year <= 1400 ? year : 1300;
     }
}

 
