package ec.edu.espe.foodandrollorder.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author RC_558
 */
public class Manager extends User{
    private String name;
    private String email;
    private static Menu menuOfRestaurant;
    
    @Override
    public String toString() {
        return  "Manager{" + "name=" + name + ", email=" + email +
                    ", userid=" + userId + ", password=" + password + ", Status=" + loginStatus + ", Date=" + registerDate + 
                    "}";
    }
    
    public Manager(String name, String email, String userId, String password, String loginStatus, Date registerDate) {
        super(userId, password, loginStatus, registerDate);
        this.name = name;
        this.email = email;        
        this.menuOfRestaurant = new Menu ();
        this.menuOfRestaurant.menuOfRestaurant();
    }
    
        public static void managerOptions(){
        Manager manager = new Manager("nombre", "email", "userId", "password", "loginStatus", new Date());
        int option = 0;
        while(option!=4){
        printManagerOptions();
        option=validateOptionMenu(option);
        switch (option) {
            case 1:        
                manager.addNewPlateOptions();                       
                break;
            case 2:           
                removePlateOptions(manager);
                break;
            case 3:
                manager.updatePrices(manager);
                menuOfRestaurant.saveMenuAsJson("menu.json");
                Menu menuFromJson = manager.getMenuOfRestaurant().readMenuFromJson("menu.json");
                if (menuFromJson != null) {
                    System.out.println("JSON file read successfully. Menu content:");
                    menuFromJson.displayFullMenu();
                } else {
                    System.out.println("Error reading JSON file or no content found.");
                }                                
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                throw new AssertionError();
            }
        }
        
        }       
            
        public void addNewPlateOptions(){
            
            int option = 0;
            while(option!=3){
            printAddNewPlateOptions(); 
            option = validateOptionMenu(option);
            switch (option) {
                case 1:      
                    addTallarinPlate();
                    break;
                case 2:      
                    addMariscosPlate();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    throw new AssertionError();
                }
            }
        
        }       
        
         public static void removePlateOptions(Manager manager){            
            int option = 0;            
            Scanner scanner = new Scanner (System.in);
            while(option!=2){
            printremovePlateOptions();         
            option = validateOptionSubMenu(option);
            switch (option) {
                case 1:       
                  menuOfRestaurant.displayFullMenu();
                  System.out.println("Enter the plate ID to remove: ");
                  int plateId = scanner.nextInt();
                  manager.removePlateById(plateId);
                    break;
                case 2:
                System.out.println("Exiting...");                   
                    break;
                default:
                    throw new AssertionError();
                }
            }
        
        }       
            
                  
    public static void printManagerOptions () {
        System.out.println("*================Manager Options=======================*");
        System.out.println("1. Add new dish");
        System.out.println("2. Remove dish");
        System.out.println("3. Update Prices");
        System.out.println("3. Exit");
    }
    
     public static void printAddNewPlateOptions () {
        System.out.println("*================Add New Plate Options=======================*");
        System.out.println("1. Add new dish in the Tallarin category ");
        System.out.println("2. Add new dish in the Mariscos category ");
        System.out.println("3. Return");
    }
     
     public static void printremovePlateOptions () {
        System.out.println("*================Remove Plate Options=======================*");
        System.out.println("1. Remove dish in the Tallarin category ");
        System.out.println("2. Remove dish in the Mariscos category ");
        System.out.println("3. Return");
    }
    
         private static int validateOptionMenu(int option){
            Scanner scanner = new Scanner(System.in);
            do{
                System.out.println("Select an option:");
                
            try {
                    option=scanner.nextInt();
                    if (option != 1 && option != 2 && option !=3 ) {
                        System.out.println("Incorrect option, Try Again.");
                    }

                } catch (Exception e) {
                    System.out.println("Enter only numbers: ");
                    scanner.nextLine();
                }
            } while (option != 1 && option != 2 && option !=3);
            return option;
         }
         
            private static int validateOptionSubMenu(int option){
                Scanner scanner = new Scanner(System.in);
                do{
                    System.out.println("Select an option:");

                try {
                        option=scanner.nextInt();
                        if (option != 1 && option != 2  ) {
                            System.out.println("Incorrect option, Try Again.");
                        }

                    } catch (Exception e) {
                        System.out.println("Enter only numbers: ");
                        scanner.nextLine();
                    }
                } while (option != 1 && option != 2 );
                return option;
             }
         
            
    public void addTallarinPlate() {        
        Plate addedPlate = registerNewPlate();
        menuOfRestaurant.addPlateToListTallarin(addedPlate);
        System.out.println("Dish successfully added to the Tallarines category");
    }
    
    public void addMariscosPlate() {
        Plate addedPlate = registerNewPlate();
        menuOfRestaurant.addPlateToListMariscos(addedPlate);
        System.out.println("Dish successfully added to the Mariscos category");
    }
    
    public void removePlateById(int plateId){                 
        menuOfRestaurant.removePlateById(plateId);
        System.out.println("Successfully removed dish.");         
    }
    
    public Plate registerNewPlate() {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("*================Add New Dish=======================*");
        System.out.println("Enter the name of the new dish: ");
        String name = scanner.nextLine();
        System.out.println("Enter the description of the new dish: ");
        String description = scanner.nextLine();
        
        double price = 0;
        boolean validPrice = false;
        while (!validPrice) {
            try {
                System.out.println("Enter the price of the new plate: ");
                price = Double.parseDouble(scanner.nextLine());
                validPrice = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter only numbers for the price.");
            }
         }
        
        System.out.println("Enter availability (YES or NO) : ");
        String availability = scanner.nextLine();
        System.out.println("Enter the preparation time of the new dish in minutes: ");
        String preparationTime = scanner.nextLine();
        System.out.println("Dish added successfully");
        Plate addedPlate = new Plate (name,description,price,availability,preparationTime); 
        
        return addedPlate;
    }
                
    public void updatePrices(Manager manager) {
        manager.menuOfRestaurant.displayFullMenu();
        Scanner scanner = new Scanner(System.in);
        
        int plateIdToUpdate = 0;
             boolean validId = false;
             while (!validId) {
                 try {
                     System.out.println("Enter the ID of the dish whose price you want to update: ");
                     plateIdToUpdate = Integer.parseInt(scanner.nextLine());
                     validId = true;
                 } catch (NumberFormatException e) {
                     System.out.println("Please enter only numbers for the dish ID.");
                 }
            }        
             
        Plate plateToUpdate = manager.menuOfRestaurant.getPlateById(plateIdToUpdate);
               if (plateToUpdate != null) {
                   double newPrice = 0;
                   boolean validNewPrice = false;
                   while (!validNewPrice) {
                       try {
                           System.out.println("Enter the new price of the dish: ");
                           newPrice = Double.parseDouble(scanner.nextLine());
                           validNewPrice = true;
                       } catch (NumberFormatException e) {
                           System.out.println("Please enter only numbers for the new price.");
                         }
                 }

            plateToUpdate.updatePrice(newPrice);
            System.out.println("Price successfully updated to: " + plateToUpdate.getPrice());
        } else {
            System.out.println("Dish ID does not exist");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Menu getMenuOfRestaurant() {
        return menuOfRestaurant;
    }

    public void setMenuOfRestaurant(Menu menuOfRestaurant) {
        this.menuOfRestaurant = menuOfRestaurant;
    }      
        
}
