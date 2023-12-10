
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
                        System.out.println("Clave incorrecta");
                        break;
                    }
                    manager();
                    break;
                case 2:
                    if(!validatePasswordRestaurant()){
                        System.out.println("Clave incorrecta");
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
    }
    
    
    
    
    private static int validateOptionCenter(int option){
            Scanner scann = new Scanner(System.in);
            do{
                System.out.println("Select to Option");
                
        try {
                option=scann.nextInt();
                if (option != 1 && option != 2 && option !=3 && option !=4) {
                    System.out.println("Opcion no valida. Intentelo de nuevo.");
                }

            } catch (Exception e) {
                System.out.println("Ingrese solo numeros");
                scann.nextLine();
            }
        } while (option != 1 && option != 2 && option !=3 && option !=4);
        return option;
    }
    
        private static int validateOptionManager(int option){
            Scanner scann = new Scanner(System.in);
            do{
                System.out.println("Select to Option");
                
        try {
                option=scann.nextInt();
                if (option != 1 && option != 2 && option !=3 ) {
                    System.out.println("Opcion no valida. Intentelo de nuevo.");
                }

            } catch (Exception e) {
                System.out.println("Ingrese solo numeros");
                scann.nextLine();
            }
        } while (option != 1 && option != 2 && option !=3);
        return option;
    }
    
    public static void printUser(){
        System.out.println("1. Manager");
        System.out.println("2. Chef");
        System.out.println("3. Customer");
        System.out.println("4. Exit");
        System.out.println("*****************************");
    }
    
    public static void printManager(){
        System.out.println("*************");
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
        
    }
    
    public static boolean validatePasswordRestaurant(){
        Scanner scan = new Scanner(System.in);
        String password="Claverestaurante";
        String enterPassword;
        System.out.println("Digite la clave del restaurante");
        enterPassword= scan.nextLine();
        return enterPassword.equals(password);
        
    }
    
    /*
        public static void registerManager(){
            Scanner scan = new Scanner(System.in);
            //Manager manager = new Manager();
            System.out.println("Ingresar nombre del gerente");
            //manager.setName(scan.nextLine());
            System.out.println("Ingrese su correo");
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

