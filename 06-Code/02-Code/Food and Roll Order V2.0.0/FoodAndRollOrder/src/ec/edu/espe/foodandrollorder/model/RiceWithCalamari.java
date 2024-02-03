
package ec.edu.espe.foodandrollorder.model;

/**
 *
 * @author Sebastian
 */
public class RiceWithCalamari extends Plate {

    private boolean hasSquidInk;

    public RiceWithCalamari(int id, String name, String description, double price, String availability, String preparationTime, boolean hasSquidInk) {
        super(id, name, "Seafood", description, price, availability, preparationTime);
        this.hasSquidInk = hasSquidInk;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Has Squid Ink: " + hasSquidInk);
    }

    public boolean hasSquidInk() {
        return hasSquidInk;
    }

    public void setHasSquidInk(boolean hasSquidInk) {
        this.hasSquidInk = hasSquidInk;
    }

   
}
