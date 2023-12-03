
package ec.edu.espe.foodandrollorders.model;

/**
 *
 * @author MateoCriollo
 */
public class Menu {
    private String plateList;
    private String categoriesOfDish;
    private float price;
    private String availability;

    public Menu() {
    }

    public Menu(String plateList, String categoriesOfDish, float price, String availability) {
        this.plateList = plateList;
        this.categoriesOfDish = categoriesOfDish;
        this.price = price;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Menu{" + "plateList=" + getPlateList() + ", categoriesOfDish=" + getCategoriesOfDish() + ", price=" + getPrice() + ", availability=" + getAvailability() + '}';
    }

    /**
     * @return the plateList
     */
    public String getPlateList() {
        return plateList;
    }

    /**
     * @param plateList the plateList to set
     */
    public void setPlateList(String plateList) {
        this.plateList = plateList;
    }

    /**
     * @return the categoriesOfDish
     */
    public String getCategoriesOfDish() {
        return categoriesOfDish;
    }

    /**
     * @param categoriesOfDish the categoriesOfDish to set
     */
    public void setCategoriesOfDish(String categoriesOfDish) {
        this.categoriesOfDish = categoriesOfDish;
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
    
    public void addPlate(){
        
    }
    
    public void removePlate(){
        
    }
    
    public void showFullMenu(){
        
    }
    
    public void updatePrice(){
        
    }
    
    public void searchDish(){
        
    }
    
    public void updateAvailability(){
        
    }
    
    public void getDetailsOfSpecificDish(){
        
    }
}
