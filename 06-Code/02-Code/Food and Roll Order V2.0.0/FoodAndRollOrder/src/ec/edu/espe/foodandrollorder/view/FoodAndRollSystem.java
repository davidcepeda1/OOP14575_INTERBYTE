package ec.edu.espe.foodandrollorder.view;

import ec.edu.espe.foodandrollorder.model.RestaurantInformation;
import java.util.Scanner;

public class FoodAndRollSystem {
    
    public static void main(String[] args) {
        int option = 0;
        registerManager();
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
                    manager();
                    break;
                case 2:
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
    
    public static void printUser(){
        System.out.println("1. Manager");
        System.out.println("2. Chef");
        System.out.println("3. Customer");
        System.out.println("4. Exit");
        System.out.println("*****************************");
    }
    
    public static void registerManager(){
        Scanner scan = new Scanner(System.in);
        System.out.println("*************");
        System.out.println("Inicializar con el sistema");
        System.out.println("registre el usuario para el manager");
        
       
    }
    
    public static void manager(){
        
    }
    
    public static void chef(){
        
    }
    
    public static void customer(){
        
    }
    
}

