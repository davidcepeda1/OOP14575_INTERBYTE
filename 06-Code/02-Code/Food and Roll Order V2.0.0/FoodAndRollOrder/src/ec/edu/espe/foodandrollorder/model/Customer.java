
package ec.edu.espe.foodandrollorder.model;

import java.util.Date;


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

    public boolean register () {
       return true;
    } 
    
   public void login () {
       
   }
   
   public void updateProfile (){
       
   }
   
   public Menu showFullMenu () {
       Menu menu = new Menu ();
       return menu;
   }
   
   public Menu searchDish () {
       Menu menu = new Menu ();
       return menu;
   }
   
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
