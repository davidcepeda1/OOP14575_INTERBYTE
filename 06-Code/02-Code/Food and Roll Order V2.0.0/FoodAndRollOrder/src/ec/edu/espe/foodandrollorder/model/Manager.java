package ec.edu.espe.foodandrollorder.model;

import java.util.Date;

/**
 *
 * @author RC_558
 */
public class Manager extends User{
    private String name;
    private String email;

    public Manager(String name, String email, String userId, String password, String loginStatus, Date registerDate) {
        super(userId, password, loginStatus, registerDate);
        this.name = name;
        this.email = email;
    }


    @Override
    public String toString() {
        return  "Manager{" + "name=" + name + ", email=" + email +
                    ", userid=" + userId + ", password=" + password + ", Status=" + loginStatus + ", Date=" + registerDate + 
                    "}";
    }
    
    public void addPlate(){
        
    }
    
    public void RemovePlate(){
        
    }
    
    public void updatePrieces(){
        
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
    
    
    
}
