
package ec.edu.espe.foodandrollorder.model;

import java.time.LocalDateTime;

/**
 *
 * @author Sebastian
 */
public class BreadedSteak extends Plate {

    private boolean isCrispy;

    public BreadedSteak(int id, String name, String description, double price, String availability, LocalDateTime preparationTime, boolean isCrispy) {
        super(id, name, "Meat", description, price, availability, preparationTime);
        this.isCrispy = isCrispy;
    }

    // Puedes anular o agregar métodos según las necesidades específicas de la milanesa
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Is Crispy: " + isCrispy);
    }

    public boolean isCrispy() {
        return isCrispy;
    }

    public void setCrispy(boolean isCrispy) {
        this.isCrispy = isCrispy;
    }

    // Otros métodos específicos de la milanesa si es necesario
}
