
package ec.edu.espe.foodandrollorders.model;

/**
 *
 * @author Sebastian
 */
public class Order {
    private int orderld;
    private String dateCreated;
    private  String dateShipped;
    private String customerName;
    private String customerld;
    private String status;
    private String shippingld;
    
    public void placeOrder() {
        
    }

    public Order(int orderld, String dateCreated, String dateShipped, String customerName, String customerld, String status, String shippingld) {
        this.orderld = orderld;
        this.dateCreated = dateCreated;
        this.dateShipped = dateShipped;
        this.customerName = customerName;
        this.customerld = customerld;
        this.status = status;
        this.shippingld = shippingld;
    }

    public int getOrderld() {
        return orderld;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getDateShipped() {
        return dateShipped;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerld() {
        return customerld;
    }

    public String getStatus() {
        return status;
    }

    public String getShippingld() {
        return shippingld;
    }

    public void setOrderld(int orderld) {
        this.orderld = orderld;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateShipped(String dateShipped) {
        this.dateShipped = dateShipped;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerld(String customerld) {
        this.customerld = customerld;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setShippingld(String shippingld) {
        this.shippingld = shippingld;
    }

    @Override
    public String toString() {
        return "Order{" + "orderld=" + orderld + ", dateCreated=" + dateCreated + ", dateShipped=" + dateShipped + ", customerName=" + customerName + ", customerld=" + customerld + ", status=" + status + ", shippingld=" + shippingld + '}';
    }

}
