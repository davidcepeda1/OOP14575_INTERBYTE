package ec.edu.espe.foodandrollorder.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author RC_558
 */
public class ShoppingCart {

    private int carId;
    private int productId;
    private int quantity;
    private Date dateAdded;
    private Menu menuOfRestaurant;
    private ArrayList<Integer> cartItems = new ArrayList<>();
    private ArrayList<Plate> platesInCart = new ArrayList<>();
    
    @Override
    public String toString() {
        return "ShoppingCart{" + "carId=" + carId + ", productId=" + productId + ", quantity=" + quantity + ", dateAdded=" + dateAdded + ", menuOfRestaurant=" + menuOfRestaurant + '}';
    }

    public ShoppingCart() {
    }

    public ShoppingCart(int carId, int productId, int quantity, Date dateAdded, Menu menuOfRestaurant) {
        this.carId = carId;
        this.productId = productId;
        this.quantity = quantity;
        this.dateAdded = dateAdded;
        this.menuOfRestaurant = menuOfRestaurant;
    }

    public void addDishToCart() {
        ShowFullMenu();
        Scanner scanner = new Scanner(System.in);

        int plateId = 0;
        boolean validId = false;
        while (!validId) {
            try {
                System.out.println("Enter the ID of the dish to add the cart: : ");
                plateId = Integer.parseInt(scanner.nextLine());
                validId = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter only numbers for the dish ID.");
            }
        }

        Plate plateToAdd = getMenuOfRestaurant().getPlateById(plateId);
        if (plateToAdd != null) {
            cartItems.add(plateId);
            platesInCart.add(plateToAdd);
            System.out.println("Dish added to the cart.");
        } else {
            System.out.println("Dish not found in the menu.");
        }
    }

    public void ShowFullMenu() {
        if (menuOfRestaurant != null) {
            menuOfRestaurant.setMenuFromJson("menu.json");
            menuOfRestaurant.displayFullMenu();
        } else {
            System.out.println("Error: Menu not initialized.");
        }
    }

    public void removeCartItem() {

    }
    
    public void viewCartDetails() {
        System.out.println("**==================Shopping Cart=====================**");
        if (cartItems.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (Integer plateId : cartItems) {
                Plate plate = getMenuOfRestaurant().getPlateById(plateId);
                if (plate != null) {
                    System.out.printf("ID: %d, Name: %s, Price: %.2f%n", plate.getId(), plate.getName(), plate.getPrice());
                }
            }
            calculateTotalPrice();
        }
    }

    public void calculateTotalPrice() {
        double totalPrice = 0.0;

        for (Plate plate : platesInCart) {
            totalPrice += plate.getPrice();
        }

        System.out.println("Total Price of items in the cart: $" + totalPrice);
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
    public Date getDateAdded() {
        return dateAdded;
    }

    /**
     * @param dateAdded the dateAdded to set
     */
    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    /**
     * @return the menuOfRestaurant
     */
    public Menu getMenuOfRestaurant() {
        return menuOfRestaurant;
    }

    /**
     * @param menuOfRestaurant the menuOfRestaurant to set
     */
    public void setMenuOfRestaurant(Menu menuOfRestaurant) {
        this.menuOfRestaurant = menuOfRestaurant;
    }

}
