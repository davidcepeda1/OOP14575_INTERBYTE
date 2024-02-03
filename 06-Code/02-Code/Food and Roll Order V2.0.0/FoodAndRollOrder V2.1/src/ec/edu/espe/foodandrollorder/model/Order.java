/**
 *
 * @author Rony Cedeño, David Cepeda, Mateo Criollo, Sebastian Criollo, INTER BYTE, DCCO-ESPE
 */
package ec.edu.espe.foodandrollorder.model;

public class Order {

    private int orderld;
    private String dateCreated;
    private String customerName;
    private String customerld;
    private boolean OrderStatus;

    public void placeOrder() {

    }

    public Order(int orderld, String dateCreated, String customerName, String customerld, boolean status) {
        this.orderld = orderld;
        this.dateCreated = dateCreated;
        this.customerName = customerName;
        this.customerld = customerld;
        this.OrderStatus = status;
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
     * @return the dateCreated
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the customerld
     */
    public String getCustomerld() {
        return customerld;
    }

    /**
     * @param customerld the customerld to set
     */
    public void setCustomerld(String customerld) {
        this.customerld = customerld;
    }

    /**
     * @return the OrderStatus
     */
    public boolean isOrderStatus() {
        return OrderStatus;
    }

    /**
     * @param OrderStatus the OrderStatus to set
     */
    public void setOrderStatus(boolean OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

}
