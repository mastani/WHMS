package Classes;

import javax.swing.JOptionPane;
import java.util.Date;


public class Person {    
    //fields:
    
    private int ID;
    private String firstName;
    private String surName;
    private Date birthDate;
    private String cellNumber;
    private String address;
    
    //Constructors :
    
    Person(){};
    Person(int ID, String firstName, String surName, Date birthDate, String cellNumber, String address){
        setID(ID);
        setName(firstName);
        setSurName(surName);
        setBirthDate(birthDate);
        setCellNumber(cellNumber);
        setAddress(address);
    } 
    
    //Mutator(setter) Methods: 
    
    public void setID(int ID){
        if(ID > 0)
            this.ID = ID;
    }
    
    public void setName(String firstName){
        if (firstName.length() <= 30)
            this.firstName = firstName;
        else
            this.firstName = firstName.substring(0, 30);
    } 
        
       
    public void setSurName(String surName){
         if (surName.length() <= 40)
            this.surName = surName;
        else
            this.surName = surName.substring(0, 40);
        
    }        
     
    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
    }
     
    public void setCellNumber(String cellNumber){
         if (cellNumber.length() == 11)
             this.cellNumber = cellNumber;
         else 
             JOptionPane.showMessageDialog(null, "Please enter a cellNumber in 11 digits : ");
     
    }
     
    public void setAddress(String address){
        this.address = address;
    }
     
     //Accessor(getter) Methods:
     
    public int getID(){
        return ID;
    }

     public String getName(){
        return firstName;
    }
      
    public String getSurName(){
        return surName;
    }

    public Date getBirthDate(){
        return birthDate;
    }

    public String getCellNumber(){
        return cellNumber;
    }

    public String getAddress(){
        return address;
    }
}
