
package ec.espe.edu.FoodAndRollOrderV.model;

import java.util.ArrayList;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class ShoppingCart {
    private int id;
    private ArrayList<Plate> plates;
    private float cartValue;

    public ShoppingCart(int id, ArrayList<Plate> plates, float cartValue) {
        this.id = id;
        this.plates = plates;
        this.cartValue = cartValue;
    }

    public ArrayList<Plate> getPlates() {
        return plates;
    }

    public void setPlates(ArrayList<Plate> plates) {
        this.plates = plates;
    }

    public float getCartValue() {
        return cartValue;
    }

    public void setCartValue(float cartValue) {
        this.cartValue = cartValue;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    
    
}
