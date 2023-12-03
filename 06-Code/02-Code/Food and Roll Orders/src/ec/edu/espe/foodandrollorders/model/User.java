package ec.edu.espe.foodandrollorders.model;

import java.time.Duration;

/**
 *
 * @author David
 */
public class User {

    private int id;
    private String name;
    private String getHamburguer;
    private String getWings;
    private String getDrink;
    private boolean isReservingTable;
    private boolean itsToEatHere;
    private boolean itsDeliveryToHome;
    private String address;
    private int phoneNumberOfUser;
    private Duration estimatedDeliveryTime;

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", getHamburguer=" + getHamburguer + ", getWings=" + getWings + ", getDrink=" + getDrink + ", isReservingTable=" + isReservingTable + ", itsToEatHere=" + itsToEatHere + ", itsDeliveryToHome=" + itsDeliveryToHome + ", address=" + address + ", phoneNumberOfUser=" + phoneNumberOfUser + ", estimatedDeliveryTime=" + estimatedDeliveryTime + '}';
    }

    public User(int id, String name, String getHamburguer, String getWings, String getDrink, boolean isReservingTable, boolean itsToEatHere, boolean itsDeliveryToHome, String address, int phoneNumberOfUser, Duration estimatedDeliveryTime) {
        this.id = id;
        this.name = name;
        this.getHamburguer = getHamburguer;
        this.getWings = getWings;
        this.getDrink = getDrink;
        this.isReservingTable = isReservingTable;
        this.itsToEatHere = itsToEatHere;
        this.itsDeliveryToHome = itsDeliveryToHome;
        this.address = address;
        this.phoneNumberOfUser = phoneNumberOfUser;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the getHamburguer
     */
    public String getGetHamburguer() {
        return getHamburguer;
    }

    /**
     * @param getHamburguer the getHamburguer to set
     */
    public void setGetHamburguer(String getHamburguer) {
        this.getHamburguer = getHamburguer;
    }

    /**
     * @return the getWings
     */
    public String getGetWings() {
        return getWings;
    }

    /**
     * @param getWings the getWings to set
     */
    public void setGetWings(String getWings) {
        this.getWings = getWings;
    }

    /**
     * @return the getDrink
     */
    public String getGetDrink() {
        return getDrink;
    }

    /**
     * @param getDrink the getDrink to set
     */
    public void setGetDrink(String getDrink) {
        this.getDrink = getDrink;
    }

    /**
     * @return the isReservingTable
     */
    public boolean isIsReservingTable() {
        return isReservingTable;
    }

    /**
     * @param isReservingTable the isReservingTable to set
     */
    public void setIsReservingTable(boolean isReservingTable) {
        this.isReservingTable = isReservingTable;
    }

    /**
     * @return the itsToEatHere
     */
    public boolean isItsToEatHere() {
        return itsToEatHere;
    }

    /**
     * @param itsToEatHere the itsToEatHere to set
     */
    public void setItsToEatHere(boolean itsToEatHere) {
        this.itsToEatHere = itsToEatHere;
    }

    /**
     * @return the itsDeliveryToHome
     */
    public boolean isItsDeliveryToHome() {
        return itsDeliveryToHome;
    }

    /**
     * @param itsDeliveryToHome the itsDeliveryToHome to set
     */
    public void setItsDeliveryToHome(boolean itsDeliveryToHome) {
        this.itsDeliveryToHome = itsDeliveryToHome;
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

    /**
     * @return the phoneNumberOfUser
     */
    public int getPhoneNumberOfUser() {
        return phoneNumberOfUser;
    }

    /**
     * @param phoneNumberOfUser the phoneNumberOfUser to set
     */
    public void setPhoneNumberOfUser(int phoneNumberOfUser) {
        this.phoneNumberOfUser = phoneNumberOfUser;
    }

    /**
     * @return the estimatedDeliveryTime
     */
    public Duration getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    /**
     * @param estimatedDeliveryTime the estimatedDeliveryTime to set
     */
    public void setEstimatedDeliveryTime(Duration estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

}
