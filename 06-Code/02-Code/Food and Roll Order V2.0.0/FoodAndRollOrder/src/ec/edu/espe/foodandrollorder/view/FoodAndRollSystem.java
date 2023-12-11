package ec.edu.espe.foodandrollorder.view;

import ec.edu.espe.foodandrollorder.model.RestaurantInformation;
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
            printUser();
            option=validateOptionCenter(option);
        
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
      
    private static int validateOptionCenter(int option){
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
    
        private static int validateOptionManager(int option){
            Scanner scanner = new Scanner(System.in);
            do{
                System.out.println("Select to Option");
                
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
    
    public static void printUser(){
        System.out.println("1. Select Login to Manager");
        System.out.println("2. Select Login to Chef");
        System.out.println("3. Select Login to Customer");
        System.out.println("4. Exit");
        System.out.println("***=======================================***");
    }
    
    public static void printManager(){
        System.out.println("***=======================================***");
        System.out.println("Manager Option");
        System.out.println("1. Register new manager");
        System.out.println("2. Login");
        System.out.println("3. Exit");
    }
    
    public static void manager(){
        int option = 0;
        while(option!=3){
        printManager();
        option=validateOptionManager(option);
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
    
    public static void chef(){
        
    }
    
    public static void customer(){
        int option = 0;
        
        
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
            System.out.println("Incorrect password. Press Enter to try again...");
            scanner.nextLine();
        }
    }while(!passwordCorrect);
        return true;
        
    }
    
    /*
        public static void registerManager(){
            Scanner scan = new Scanner(System.in);
            //Manager manager = new Manager();
            System.out.println("Enter Manager name: ");
            //manager.setName(scan.nextLine());
            System.out.println("Enter Manager enail: ");
            //manager.setEmail(scan.nextLine());
                      
                   
    }
    */        
    /*
    public static Manager registerManager (){
        
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
        }
    
        public static void menuOfRestaurant () {
            
           Menu menu = new Menu ();
           
           ArrayList<Plate> listPlates = new ArrayList<Plate> ();
            
           Plate plate1 = new Plate (1,"Tallarín Especial","Tallarín","Pollo, Lomo, Camarón y verduras",5.60,"Disponible","15 minutos");
           Plate plate2 = new Plate (2,"Tallarín Salteado con Pollol","Tallarín","Pollo y verduras",5.70,"Disponible","15 minutos");   
            
            listPlates.add(plate1);
            listPlates.add(plate2);
            
            menu.setPlateList(listPlates);
            
            System.out.println("Tallarín:  "
                    + menu.getPlateList().toString());
        }*/
        
       
        
}

