
package ec.edu.espe.foodandrollorders.model;

/**
 *
 * @author Sebastian
 */
public class Orderdetails {
    private int orderld;
    private int productld;
    private String productName;
    private int quantity;
    private float unitCost;
    private float subTotal;
    
    public void calculatePrice() {
        // Lógica para calcular el precio total (subTotal)
        subTotal = quantity * unitCost;
    }
}
