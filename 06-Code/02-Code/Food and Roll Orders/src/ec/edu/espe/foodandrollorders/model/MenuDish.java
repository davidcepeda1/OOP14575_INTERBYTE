
package ec.edu.espe.foodandrollorders.model;

import java.util.Date;

/**
 *
 * @author MateoCriollo
 */
public class MenuDish {
    private String name;
    private int id;
    private String category;
    private String description;
    private float price;
    private String availability;
    private float prepartationTime;

    public MenuDish() {
    }

    public MenuDish(String name, int id, String category, String description, float price, String availability, float preparationTime) {
        this.name = name;
        this.id = id;
        this.category = category;
        this.description = description;
        this.price = price;
        this.availability = availability;
       // this.preparationTime = preparationTime;
    }

    
}
