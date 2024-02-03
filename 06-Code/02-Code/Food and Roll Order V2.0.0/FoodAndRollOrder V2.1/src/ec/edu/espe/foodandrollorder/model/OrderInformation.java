/**
 *
 * @author Rony Cedeño, David Cepeda, Mateo Criollo, Sebastian Criollo, INTER BYTE, DCCO-ESPE
 */
package ec.edu.espe.foodandrollorder.model;

public class OrderInformation {

    private int shippingld;
    private int shippingCost;

    public OrderInformation(int shippingld, int shippingCost) {
        this.shippingld = shippingld;
        this.shippingCost = shippingCost;
    }

    public void updateShippingInfo() {

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
