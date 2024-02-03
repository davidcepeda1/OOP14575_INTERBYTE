
package ec.edu.espe.foodandrollorder.model;

/**
 *
 * @author Sebastian
 */
public class GrilledChicken extends Plate {

    private boolean marinated;

    public GrilledChicken(int id, String name, String description, double price, String availability, String preparationTime, boolean marinated) {
        super(id, name, "Chicken", description, price, availability, preparationTime);
        this.marinated = marinated;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Marinated: " + marinated);
    }

    public boolean isMarinated() {
        return marinated;
    }

    public void setMarinated(boolean marinated) {
        this.marinated = marinated;
    }

}
