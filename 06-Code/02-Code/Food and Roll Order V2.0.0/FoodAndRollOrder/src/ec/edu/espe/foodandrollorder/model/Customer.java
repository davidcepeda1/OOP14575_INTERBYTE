package ec.edu.espe.foodandrollorder.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;


public class Customer extends User {
    
    private String customerName;
    private String email;
    private String phoneNumber;
    private String address;

    @Override
    public String toString() {
        return "Customer{" + "customerName=" + getCustomerName() + ", email=" + getEmail() + ", phoneNumber=" + getPhoneNumber() + ", address=" + getAddress() + '}';
    }
    
    public Customer(String customerName, String email, String phoneNumber, String address, String userId, String password, String loginStatus, Date registerDate) {
        super(userId, password, loginStatus, registerDate);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public String toCSV() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                    customerName, email, phoneNumber, address, getUserId(), getPassword(), getLoginStatus(), getRegisterDate());
        }
    
    public boolean validateLogin(String enteredUserId, String enteredPassword) {
        return getUserId().equals(enteredUserId) && getPassword().equals(enteredPassword);
}

    public static ArrayList<Customer> readCustomersFromCSV(String csvFileName) {
        ArrayList<Customer> customers = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(csvFileName))) {
        String line;

        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");

            String customerName = data[0];
            String email = data[1];
            String phoneNumber = data[2];
            String address = data[3];
            String userId = data[4];
            String password = data[5];
            String loginStatus = data[6];
            Date registerDate = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH).parse(data[7]);


            Customer customer = new Customer(customerName, email, phoneNumber, address, userId, password, loginStatus, registerDate);
            customers.add(customer);
        }
    } catch (IOException | ParseException e) {
        e.printStackTrace();
    }

    return customers;
}

    public boolean register () {
       return true;
    } 
    
   public void login () {
       
   }
   
   public void updateProfile (){
       
   }
   

   public Menu showFullMenu () {
       //Menu menu = new Menu();
       //return menu;
        return null;
       //Menu menu = new Menu();
       //return menu;
   }
   
   public Menu searchDish () {
       //Menu menu = new Menu();
       //return menu;
        return null;
       //Menu menu = new Menu();
       //return menu;
   }

   //public Menu showFullMenu () {
      // Menu menu = new Menu ();
      // return menu;
   //}
   
   //public Menu searchDish () {
     //  Menu menu = new Menu ();
      // return menu;
   //}

   
    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
}