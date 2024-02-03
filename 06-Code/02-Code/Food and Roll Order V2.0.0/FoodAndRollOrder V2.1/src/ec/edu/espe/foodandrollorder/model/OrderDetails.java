/**
 *
 * @author Rony Cedeño, David Cepeda, Mateo Criollo, Sebastian Criollo, INTER BYTE, DCCO-ESPE
 */
package ec.edu.espe.foodandrollorder.model;

public class OrderDetails {

    private int orderld;
    private int productld;
    private String productName;
    private int quantity;
    private float unitCost;
    private float subTotal;

    public void calculatePrice() {
        // Lógica para calcular el precio total (subTotal)
        setSubTotal(getQuantity() * getUnitCost());
    }

    public OrderDetails(int orderld, int productld, String productName, int quantity, float unitCost, float subTotal) {
        this.orderld = orderld;
        this.productld = productld;
        this.productName = productName;
        this.quantity = quantity;
        this.unitCost = unitCost;
        this.subTotal = subTotal;
    }

    /**
     * @return the orderld
     */
    public int getOrderld() {
        return orderld;
    }

    /**
     * @param orderld the orderld to set
     */
    public void setOrderld(int orderld) {
        this.orderld = orderld;
    }

    /**
     * @return the productld
     */
    public int getProductld() {
        return productld;
    }

    /**
     * @param productld the productld to set
     */
    public void setProductld(int productld) {
        this.productld = productld;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the unitCost
     */
    public float getUnitCost() {
        return unitCost;
    }

    /**
     * @param unitCost the unitCost to set
     */
    public void setUnitCost(float unitCost) {
        this.unitCost = unitCost;
    }

    /**
     * @return the subTotal
     */
    public float getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

}
