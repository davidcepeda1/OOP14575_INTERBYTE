package ec.edu.espe.foodandrollorder.model;

/**
 *
 * @author RC_558
 */
public class ShoppingCart {
    private int carId;
    private int productId;
    private int quantity;
    private int dateAdded;

    public ShoppingCart(int carId, int productId, int quantity, int dateAdded) {
        this.carId = carId;
        this.productId = productId;
        this.quantity = quantity;
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "carId=" + carId + ", productId=" + productId + ", quantity=" + quantity + ", dateAdded=" + dateAdded + '}';
    }

    public void addCartItem(){
        
    }
    
    public void removeCartItem(){
        
    }
    
    public void updateQuantity(){
        
    }
    
    public void viewCartDetails(){
        
    }
    
    public void checkout(){
        
    }
    
    /**
     * @return the carId
     */
    public int getCarId() {
        return carId;
    }

    /**
     * @param carId the carId to set
     */
    public void setCarId(int carId) {
        this.carId = carId;
    }

    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
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
     * @return the dateAdded
     */
    public int getDateAdded() {
        return dateAdded;
    }

    /**
     * @param dateAdded the dateAdded to set
     */
    public void setDateAdded(int dateAdded) {
        this.dateAdded = dateAdded;
    }
    
    
    
}
