
package ec.edu.espe.foodandrollorders.model;

import java.util.Date;

/**
 *
 * @author MateoCriollo
 */
public class MenuDish {
    private String name;
    private int id;
    private String category;
    private String description;
    private float price;
    private String availability;
    private Date preparationTime;

    public MenuDish() {
    }

    public MenuDish(String name, int id, String category, String description, float price, String availability, Date preparationTime) {
        this.name = name;
        this.id = id;
        this.category = category;
        this.description = description;
        this.price = price;
        this.availability = availability;
        this.preparationTime = preparationTime;
    }

    @Override
    public String toString() {
        return "MenuDish{" + "name=" + getName() + ", id=" + getId() + ", category=" + getCategory() + ", description=" + getDescription() + ", price=" + getPrice() + ", availability=" + getAvailability() + ", preparationTime=" + getPreparationTime() + '}';
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the availability
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    /**
     * @return the preparationTime
     */
    public Date getPreparationTime() {
        return preparationTime;
    }

    /**
     * @param preparationTime the preparationTime to set
     */
    public void setPreparationTime(Date preparationTime) {
        this.preparationTime = preparationTime;
    }
    
    public void checkAvailability(){
        
    }
    
    public void getDetail(){
        
    }
    
    public void updatePrice(){
        
    }
    
    public void updateAvailability(){
        
    }
    
    public void modifyDescription(){
        
    }
    
    public void calculatePreparationTime(){
        
    }
    
    public void addImage(){
        
    }
}
