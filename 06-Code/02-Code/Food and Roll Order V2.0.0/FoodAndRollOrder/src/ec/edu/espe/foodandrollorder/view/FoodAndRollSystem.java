package ec.edu.espe.foodandrollorder.view;

import ec.edu.espe.foodandrollorder.model.RestaurantInformation;
import ec.edu.espe.foodandrollorder.model.Plate;
import ec.edu.espe.foodandrollorder.model.Menu;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

public class FoodAndRollSystem {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int option = 0;
        
        while(option !=4){
            
            RestaurantInformation restaurantInfo = new RestaurantInformation(
                "123 Main St",
                "555-1234",
                "info@example.com",
                "Next to the Park");
            restaurantInfo.showSpecificLocation();
            printMenu();
            option=validateOptionMenu(option);
        
            switch (option) {
                case 1:
                    if(!validatePasswordRestaurant()){
                        System.out.println("Incorrect Password");
                        break;
                    }
                    manager();
                    break;
                case 2:
                    if(!validatePasswordRestaurant()){
                        System.out.println("Incorrect Password");
                        break;
                    }
                    chef();
                    break; 
                case 3:
                    customer();
                    break;
                case 4:
                    System.out.println("Exiting...");;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        scann.close();
    }
    
    public static boolean validatePasswordRestaurant(){
        Scanner scanner = new Scanner(System.in);
        String password="Claverestaurante";
        String enterPassword;
        
        boolean passwordCorrect = false;
        
        do{
            System.out.println("Enter the restaurant password: ");
            enterPassword= scanner.nextLine();
        
        if(enterPassword.equals(password)){
            System.out.println("Correct password. Press Enter to continue...");
            scanner.nextLine();
            passwordCorrect = true;
        }else{
            System.out.println("Incorrect password.");
        }
    }while(!passwordCorrect);
        return true;
        
    }  
     
    private static int validateOptionMenu(int option){
            Scanner scanner = new Scanner(System.in);
            do{
                System.out.println("Select an option:");
                
        try {
                option = scanner.nextInt();
                if (option != 1 && option != 2 && option !=3 && option !=4) {
                    System.out.println("Incorrect option, Try Again.");
                }

            } catch (Exception e) {
                System.out.println("Enter only numbers: ");
                scanner.nextLine();
                option = 0;
            }
        } while (option != 1 && option != 2 && option !=3 && option !=4);
        return option;
    }
    
        private static int validateOptionSubMenu(int option){
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
    
    public static void printMenu(){
        System.out.println("1. Select Login to Manager");
        System.out.println("2. Select Login to Chef");
        System.out.println("3. Select Login to Customer");
        System.out.println("4. Exit");
        System.out.println("*=======================================*");
    }
    
    public static void printManager(){
        System.out.println("*=======================================*");
        System.out.println("Manager Option");
        System.out.println("1. Register new manager");
        System.out.println("2. Login");
        System.out.println("3. Exit");
    }
    
    public static void printChef(){
        System.out.println("*=======================================*");
        System.out.println("Chef Option");
        System.out.println("1. Register new chef");
        System.out.println("2. Login");
        System.out.println("3. Exit");
    }
    
    public static void printCustomer(){
        System.out.println("*=======================================*");
        System.out.println("Customer Option");
        System.out.println("1. Register new customer");
        System.out.println("2. Login");
        System.out.println("3. Exit");
    }
    
    public static void manager(){
        int option = 0;
        while(option!=3){
        printManager();
        option=validateOptionSubMenu(option);
        switch (option) {
            case 1:     
                registerNewManager();
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
    
    public static void chef(){
        int option = 0;
        while(option!=3){
        printChef();
        option=validateOptionSubMenu(option);
        switch (option) {
            case 1:          
                break;
            case 2:  
                menuOfRestaurant();
                break;
            case 3:
                
                break;
            default:
                throw new AssertionError();
            }
        }
    }

    public static void customer(){
        int option = 0;
        while(option!=3){
        printCustomer();
        option=validateOptionSubMenu(option);
        switch (option) {
            case 1: 
                registerNewCustomer();
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
    
    public static void registerNewCustomer(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== We need some information about yourself, please provide us with correct and real data to proceed with the delivery ==");
        System.out.println("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.println("Enter customer email: ");
        String customerEmail = scanner.nextLine();
        
        System.out.println("Enter customer phone number: ");
        String customerPhoneNumber = scanner.nextLine();
        
        System.out.println("Enter customer address: ");
        String customerAddress = scanner.nextLine();
        
        System.out.println(" == Information for Login ==");
        System.out.println("Enter customer ID: ");
        String userId = scanner.nextLine();
        
        System.out.println("Enter customer password: ");
        String password = scanner.nextLine();
        
    }    
    
    public static void registerNewManager(){
    }
        
		/*
            Scanner register = new Scanner (System.in);
            Date date = new Date ();
            System.out.println("Ingrese el nombre:");
            String name = register.next();
            System.out.println("Entered the email: ");
            String email = register.next();
            System.out.println("Entered user: ");
            String id = register.next();    
            System.out.println("password: ");
            String password = register.next();
            System.out.println("Status:");
            String status = register.next();               
            Manager manager = new Manager (name,email,id,password,status,date);
            return manager;                               
        */

    /*
	public static void menuOfRestaurant () {
            
           Menu menu = new Menu ();
           
           ArrayList<Plate> listTallarin = new ArrayList<Plate> ();
           ArrayList<Plate> listMariscos = new ArrayList<Plate> ();
            
           Plate tallarinPlate1 = new Plate (1,"Tallarín Especial","Tallarín","Pollo, Lomo, Camarón y verduras",5.60,"Disponible","15 minutos");
           Plate tallarinPlate2 = new Plate (2,"Tallarín Salteado con Pollo","Tallarín","Pollo y verduras",5.70,"Disponible","15 minutos");   
                        
           Plate mariscosPlate1 = new Plate (1,"Calamar salteado con Legumbres ","Mariscos","Calamar",5.60,"Sí","15 minutos");
           Plate mariscosPlate2 = new Plate (2,"Calamar y Camarón salteado con Legumbres","Mariscos","Calamar y Camarón",5.70,"Sí","15 minutos");   
           
            listTallarin.add(tallarinPlate1);
            listTallarin.add(tallarinPlate2);
            
            listMariscos.add(mariscosPlate1);
            listMariscos.add(mariscosPlate2);
            
            menu.setPlateListTallarin(listTallarin);
            menu.setPlateListMariscos(listMariscos);                     
        }
        
       
        
}