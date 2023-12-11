
package ec.edu.espe.foodandrollorder.model;

import java.time.LocalDateTime;

/**
 *
 * @author Sebastian
 */
public class StirFriedNoodlesWithChicken extends Plate {

    private boolean hasVegetables;

    public StirFriedNoodlesWithChicken(int id, String name, String description, double price, String availability, LocalDateTime preparationTime, boolean hasVegetables) {
        super(id, name, "Noodles", description, price, availability, preparationTime);
        this.hasVegetables = hasVegetables;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Has Vegetables: " + hasVegetables);
    }

    public boolean hasVegetables() {
        return hasVegetables;
    }

    public void setHasVegetables(boolean hasVegetables) {
        this.hasVegetables = hasVegetables;
    }

}
