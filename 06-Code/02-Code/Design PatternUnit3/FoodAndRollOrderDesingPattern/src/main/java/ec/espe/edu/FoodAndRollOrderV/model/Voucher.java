
package ec.espe.edu.FoodAndRollOrderV.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Voucher {
    private int id;
    private Customer customer;
    private ShoppingCart shoppingCart;
    private double amountTotal;

    public Voucher(int id, Customer customer, ShoppingCart shoppingCart, double amountTotal) {
        this.id = id;
        this.customer = customer;
        this.shoppingCart = shoppingCart;
        this.amountTotal = amountTotal;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the shoppingCart
     */
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    /**
     * @param shoppingCart the shoppingCart to set
     */
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    /**
     * @return the amountTotal
     */
    public double getAmountTotal() {
        return amountTotal;
    }

    /**
     * @param amountTotal the amountTotal to set
     */
    public void setAmountTotal(double amountTotal) {
        this.amountTotal = amountTotal;
    }
    
    
    
    
}
