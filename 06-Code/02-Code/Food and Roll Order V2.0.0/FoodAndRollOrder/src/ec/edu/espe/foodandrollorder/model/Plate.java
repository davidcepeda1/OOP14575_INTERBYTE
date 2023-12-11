package ec.edu.espe.foodandrollorder.model;

import java.time.LocalDateTime;

public class Plate {
    
    private int id;
    private String name;
    private String category;
    private String description;
    private double price;
    private String availability;
    private LocalDateTime preparationTime;

    @Override
    public String toString() {
        return "Plate{" + "Id=" + getId() + ", name=" + getName() + ", category=" + getCategory() + ", description=" + getDescription() + ", price=" + getPrice() + ", availability=" + getAvailability() + ", preparationTime=" + getPreparationTime() + '}';
    }
    
    public Plate(int Id, String name, String category, String description, double price, String availability, LocalDateTime preparationTime) {
        this.id = Id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.availability = availability;
        this.preparationTime = preparationTime;
    }
        
    public void checkAvaiability () {
        
    }
    
    public void getDetails () {
        
    }
    
    public void updatePrieces () {
        
    }
    
    public void updateAvailability () {
        
    }
    
    public void modifyDescription () {
        
    }
    
    public void calculatePreparationTime () {
        
    }
    
    public void addImage () { 
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param Id the id to set
     */
    public void setId(int Id) {
        this.id = Id;
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
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
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
    public LocalDateTime getPreparationTime() {
        return preparationTime;
    }

    /**
     * @param preparationTime the preparationTime to set
     */
    public void setPreparationTime(LocalDateTime preparationTime) {
        this.preparationTime = preparationTime;
    }
    
    
    
}

