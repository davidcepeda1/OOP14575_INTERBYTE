
package ec.espe.edu.FoodAndRollOrderV.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Plate {
    private int id;
    private String description;
    private float price;
    private String type;
    private int quantity;
    private float priceTotal;

    public Plate(int id, String description, float price, String type) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.type = type;
        this.quantity =1;
    }

    public Plate(int id, String description, float price, String type, int quantity) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.type = type;
        this.quantity = quantity;
    }

    public Plate(int id, String description, float price, String type, int quantity, float priceTotal) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.type = type;
        this.quantity = quantity;
        this.priceTotal = priceTotal;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(float priceTotal) {
        this.priceTotal = priceTotal;
    }
    
    
    
}
