package ec.edu.espe.foodandrollorders.view;

import ec.edu.espe.foodandrollorders.model.User;
import java.util.Scanner;

public class FoodAndRollOrdersSystem {

    public static void main(String[] args) {
        int i=1;
        String passworRestaurant="pasword";
        String pass;
        User user = new User ();
        
        
        do{
        System.out.println("********************");
        System.out.println("Bienvenido al restaurante food and roll");
        
        int option = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Que tipo de persona es?");
            System.out.println("1. Usuario");
            System.out.println("2. Cliente");
            System.out.println("Seleccione una opcion");

            try {
                option = scan.nextInt();

                if (option != 1 && option != 2) {
                    System.out.println("Opcion no valida. Intentelo de nuevo.");
                }

            } catch (Exception e) {
                System.out.println("Ingrese solo numeros");
                scan.nextLine();
            }
        } while (option != 1 && option != 2);

        switch (option) {
            case 1:
                System.out.println("Digite la clave del restaurante");
                pass=scan.next();
                
                if(!pass.equals(passworRestaurant)){
                    System.out.println("Codigo erroneo");
                }else{
                    enterUser();
                }
                break;

                
            case 2:
                enterCustomer();
                break;
                
            default:
                throw new AssertionError();
        }
        }while(i==1);
        
    }
    
    
    public static void enterUser () {
        int option = 0;
        
        do{
        do {
            System.out.println("****************");
            System.out.println("User");
            System.out.println("Que desea hacer");
            System.out.println("1.Crear Usuario");
            System.out.println("2.Ingresar usuario");
            System.out.println("3 Regresar");
            System.out.println("Seleccione una opcion");
            Scanner scan = new Scanner(System.in);
            
            try {
                option = scan.nextInt();

                if (option != 1 && option != 2 && option!=3) {
                    System.out.println("Opcion no valida. Intentelo de nuevo.");
                }

            } catch (Exception e) {
                System.out.println("Ingrese solo numeros");
                scan.nextLine();
            }
        } while (option != 1 && option != 2 && option !=3);

        switch (option) {
            case 1:
                System.out.println("Caso 1 de usurio");
                registerNewUser();
                break;
                
            case 2:
                System.out.println("caso 2 usuario");
                break;
            
            case 3 :
                System.out.println("Regresando...");
                break;
                
            default:
                throw new AssertionError();
        }
    }while(option != 3);
        }
    

    public static void registerNewUser(){
        User user=new User();
        Scanner scan=new Scanner(System.in);
        char array[];
        String password;
        System.out.println("Registro de un nuevo usuario");
        System.out.println("Elija un Username");
        user.setUserId(scan.next());
        scan.nextLine();
        System.out.println("Elija una constrasena");
        password=scan.nextLine();
        
        array=password.toCharArray();
        
        for(var i=0; i<(array.length) ;i++){
            array[i]=(char)((char)1+array[i]);
        }
        
        user.setPassword(String.valueOf(array));
        System.out.println("contrasen codificada"+user.getPassword());
        
    }

    
    
    public static void enterCustomer(){
        int option = 0;
        do{
        do {
            System.out.println("****************");
            System.out.println("Customer");
            System.out.println("Que desea hacer");
            System.out.println("1.Ver menu");
            System.out.println("2.Realizar Pedido");
            System.out.println("3.Ver pedido");
            System.out.println("4.Regresar");
            System.out.println("Seleccione una opcion");
            Scanner scan = new Scanner(System.in);
            
            try {
                option = scan.nextInt();

                if (option != 1 && option != 2 && option!=3 && option !=4) {
                    System.out.println("Opcion no valida. Intentelo de nuevo.");
                }

            } catch (Exception e) {
                System.out.println("Ingrese solo numeros");
                scan.nextLine();
            }
        } while (option != 1 && option != 2 && option !=3 && option !=4);

        switch (option) {
            case 1:
                System.out.println("Caso 1 ver menu");
                break;
                
            case 2:
                System.out.println("caso 2 realizar pedido");
                break;
            
            case 3 :
                System.out.println("caso 3 ver pedido");
                break;
                
            case 4 :
                System.out.println("Regresando....");
                break;
            default:
                throw new AssertionError();
        }
    }while(option != 4);
    }
}
