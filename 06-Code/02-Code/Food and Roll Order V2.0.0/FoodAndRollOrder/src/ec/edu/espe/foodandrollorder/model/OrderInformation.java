/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.foodandrollorder.model;

/**
 *
 * @author Sebatian
 */
public class OrderInformation {
    private int shippingld;
    private int shippingCost;

    public OrderInformation(int shippingld, int shippingCost) {
        this.shippingld = shippingld;
        this.shippingCost = shippingCost;
    }
    
    public void updateShippingInfo(){
        
    }

    /**
     * @return the shippingld
     */
    public int getShippingld() {
        return shippingld;
    }

    /**
     * @param shippingld the shippingld to set
     */
    public void setShippingld(int shippingld) {
        this.shippingld = shippingld;
    }

    /**
     * @return the shippingCost
     */
    public int getShippingCost() {
        return shippingCost;
    }

    /**
     * @param shippingCost the shippingCost to set
     */
    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }
            
}
