/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.foodandrollorders.model;

import java.time.Duration;

public class Customer extends User {
    
    private String adrressOfUser;    
    private String emailOfUser;
    private String locationReference;    

    @Override
    public String toString() {
        return "UserInformation{" + "adrressOfUser=" + getAdrressOfUser() + ", emailOfUser=" + getEmailOfUser() + ", locationReference=" + getLocationReference() + '}';
    }
        

    public Customer(String adrressOfUser, String emailOfUser, String locationReference, int id, String name, String getHamburguer, String getWings, String getDrink, boolean isReservingTable, boolean itsToEatHere, boolean itsDeliveryToHome, String address, int phoneNumberOfUser, Duration estimatedDeliveryTime) {
        super(id, name, getHamburguer, getWings, getDrink, isReservingTable, itsToEatHere, itsDeliveryToHome, address, phoneNumberOfUser, estimatedDeliveryTime);
        this.adrressOfUser = adrressOfUser;   
        this.emailOfUser = emailOfUser;
        this.locationReference = locationReference;
    }                          
        
    public static void register (){        
    
    }
        
    public void login () {
        
    }

    public void updateProfile () {
        
    }   
    
    public void makeReservation () {
        
    }
    
    public void cancelReservation () {
        
    }
    
    /**
     * @return the adrressOfUser
     */
    public String getAdrressOfUser() {
        return adrressOfUser;
    }

    /**
     * @param adrressOfUser the adrressOfUser to set
     */
    public void setAdrressOfUser(String adrressOfUser) {
        this.adrressOfUser = adrressOfUser;
    }

    /**
     * @return the emailOfUser
     */
    public String getEmailOfUser() {
        return emailOfUser;
    }

    /**
     * @param emailOfUser the emailOfUser to set
     */
    public void setEmailOfUser(String emailOfUser) {
        this.emailOfUser = emailOfUser;
    }

    /**
     * @return the locationReference
     */
    public String getLocationReference() {
        return locationReference;
    }

    /**
     * @param locationReference the locationReference to set
     */
    public void setLocationReference(String locationReference) {
        this.locationReference = locationReference;
    }
   }
