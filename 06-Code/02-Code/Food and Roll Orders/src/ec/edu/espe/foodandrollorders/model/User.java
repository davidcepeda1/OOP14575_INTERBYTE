package ec.edu.espe.foodandrollorders.model;

import java.time.Duration;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class User {

    private String userId;
    private String password;
    private String loginStatus;
    private Date registerDate;

    public User(String userId, String password, String loginStatus, Date registerDate) {
        this.userId = userId;
        this.password = password;
        this.loginStatus = loginStatus;
        this.registerDate = registerDate;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + getUserId() + ", password=" + getPassword() + ", loginStatus=" + getLoginStatus() + ", registerDate=" + getRegisterDate() + '}';
    }

   
   /**
     * @return the userId
     */
    public String getUserId() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el userId");
        userId=scan.nextLine();
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el password");
        password=scan.nextLine();
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the loginStatus
     */
    public String getLoginStatus() {
        return loginStatus;
    }

    /**
     * @param loginStatus the loginStatus to set
     */
    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    /**
     * @return the registerDate
     */
    public Date getRegisterDate() {
        registerDate=new Date();
        return registerDate;
    }

    /**
     * @param registerDate the registerDate to set
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String setUserId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
