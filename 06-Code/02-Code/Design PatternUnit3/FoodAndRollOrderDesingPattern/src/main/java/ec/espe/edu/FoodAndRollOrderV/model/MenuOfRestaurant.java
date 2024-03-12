
package ec.espe.edu.FoodAndRollOrderV.model;

import java.util.ArrayList;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class MenuOfRestaurant {
    private int id;
    
    private ArrayList<Plate> plates;

    /**
     * @return the plates
     */
    public ArrayList<Plate> getPlates() {
        return plates;
    }

    /**
     * @param plates the plates to set
     */
    public void setPlates(ArrayList<Plate> plates) {
        this.plates = plates;
    }

    public int getId() {
        return id;
    }
    
    
}
