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
    private Menu menuOfRestaurant;
    
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
        this.menuOfRestaurant = new Menu (new ArrayList<>(),new ArrayList<>());
    }
    
        public static void managerFunctions(){
        int option = 0;
        while(option!=3){
        printManagerFuctions();
        option=validateOptionMenu(option);
        switch (option) {
            case 1:        
                addNewPlateOptions();
                break;
            case 2:           
                
                break;
            case 3:
                
                break;
            default:
                throw new AssertionError();
            }
        }
        
        }       
            
        public static void addNewPlateOptions(){
            
            int option = 0;
            while(option!=3){
            printAddNewPlateOptions();           
            switch (option) {
                case 1:                                     
                    break;
                case 2:                     
                    break;
                case 3:

                    break;
                default:
                    throw new AssertionError();
                }
            }
        
        }       
        
         public static void removePlateOptions(){
            
            int option = 0;
            while(option!=3){
            printremovePlateOptions();           
            switch (option) {
                case 1:       
                   
                    break;
                case 2:                     
                    break;
                case 3:

                    break;
                default:
                    throw new AssertionError();
                }
            }
        
        }       
            
                  
    public static void printManagerFuctions () {
        System.out.println("*================Manager Options=======================*");
        System.out.println("1. Add new dish");
        System.out.println("2. Remove dish");
        System.out.println("3. Return");
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
         
            
    public Plate addTallarinPlate() {
        
        Scanner scanner = new Scanner (System.in); 
        
        System.out.println("*================ Add Plate =======================*");
        System.out.println("Ingrese el nombre del nuevo plato: ");
        String name = scanner.next();
        System.out.println("Ingrese  la descripción del nuevo plato: ");
        String description = scanner.next();
        System.out.println("Ingrece el precio del nuevo plato: ");
        double price = scanner.nextDouble();
        System.out.println("Ingrese un la disponiblidad (SI o NO) : ");
        String availability = scanner.next();
        System.out.println("Ingrese el tiempo de preparación del nuevo plato en minutos: ");
        String preparationTime = scanner.next();
        System.out.println("Plato agrefado exitosamente");
        
        Plate addedPlate = new Plate (name,description,price,availability,preparationTime);        
        menuOfRestaurant.addPlateToListTallarin(addedPlate);
        return addedPlate;
    }
    
    public void removePlateById(int plateId){
                 
        menuOfRestaurant.removePlateById(plateId);
        System.out.println("Plato eliminado exitosamente.");         
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
