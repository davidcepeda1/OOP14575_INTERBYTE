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
                //menuOfRestaurant.displayFullMenu();
                break;
            case 2:           
                removePlateOptions(manager);
                break;
            case 3:
                manager.updatePrices(manager);
                break;
            case 4:
                System.out.println("Saliendo...");
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
                    System.out.println("Saliendo...");
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
                  System.out.println("Ingrese el ID del plato que quiere eliminar: ");
                  int plateId = scanner.nextInt();
                  manager.removePlateById(plateId);
                    break;
                case 2:
                System.out.println("Saliendo...");                   
                    break;
                default:
                    throw new AssertionError();
                }
            }
        
        }       
            
                  
    public static void printManagerOptions () {
        System.out.println("*================Opciones del Administrador=======================*");
        System.out.println("1. Agregar un plato nuevo");
        System.out.println("2. Eliminar un plato");
        System.out.println("3. Actualizar precios");
        System.out.println("3. Exit");
    }
    
     public static void printAddNewPlateOptions () {
        System.out.println("*================Opciones de Agregar un Nuevo Plato=======================*");
        System.out.println("1. Agrgar un nuevo plato a la categoria Tallarines ");
        System.out.println("2. Agrgar un nuevo plato a la categoria Mariscos ");
        System.out.println("3. Regresar");
    }
     
     public static void printremovePlateOptions () {
        System.out.println("*================Opciones de Eliminar un Plato=======================*");
        System.out.println("1. Eliminar un plato de la categoria Tallarines ");
        System.out.println("2. Eliminar un plato de la categoria  Mariscos ");
        System.out.println("3. Regresar");
    }
    
         private static int validateOptionMenu(int option){
            Scanner scanner = new Scanner(System.in);
            do{
                System.out.println("Seleccione una opcion:");
                
            try {
                    option=scanner.nextInt();
                    if (option != 1 && option != 2 && option !=3 ) {
                        System.out.println("Opcion incorrecta, ingrese solo numeros.");
                    }

                } catch (Exception e) {
                    System.out.println("Ingrese solo numeros: ");
                    scanner.nextLine();
                }
            } while (option != 1 && option != 2 && option !=3);
            return option;
         }
         
            private static int validateOptionSubMenu(int option){
                Scanner scanner = new Scanner(System.in);
                do{
                    System.out.println("Seleccione una opcion:");

                try {
                        option=scanner.nextInt();
                        if (option != 1 && option != 2  ) {
                            System.out.println("Opcion incorrecta, intente otra vez.");
                        }

                    } catch (Exception e) {
                        System.out.println("Ingrese solo numeros: ");
                        scanner.nextLine();
                    }
                } while (option != 1 && option != 2 );
                return option;
             }
         
            
    public void addTallarinPlate() {        
        Plate addedPlate = registerNewPlate();
        menuOfRestaurant.addPlateToListTallarin(addedPlate);
        System.out.println("Plato añadido exitosamente a la categoría Tallarín");
    }
    
    public void addMariscosPlate() {
        Plate addedPlate = registerNewPlate();
        menuOfRestaurant.addPlateToListMariscos(addedPlate);
        System.out.println("Plato añadido exitosamente a la categoría Mariscos");
    }
    
    public void removePlateById(int plateId){                 
        menuOfRestaurant.removePlateById(plateId);
        System.out.println("Plato eliminado exitosamente.");         
    }
    
    public Plate registerNewPlate() {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("*================Agregar Plato Nuevo =======================*");
        System.out.println("Ingrese el nombre del nuevo plato: ");
        String name = scanner.nextLine();
        System.out.println("Ingrese  la descripción del nuevo plato: ");
        String description = scanner.nextLine();
        
        double price = 0;
        boolean validPrice = false;
        while (!validPrice) {
            try {
                System.out.println("Ingrese el precio del nuevo plato: ");
                price = Double.parseDouble(scanner.nextLine());
                validPrice = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese solo números para el precio.");
            }
         }
        
        System.out.println("Ingrese un la disponibilidad (SI o NO) : ");
        String availability = scanner.nextLine();
        System.out.println("Ingrese el tiempo de preparación del nuevo plato en minutos: ");
        String preparationTime = scanner.nextLine();
        System.out.println("Plato agrefado exitosamente");
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
                     System.out.println("Ingrese el ID del plato cuyo precio desea actualizar: ");
                     plateIdToUpdate = Integer.parseInt(scanner.nextLine());
                     validId = true;
                 } catch (NumberFormatException e) {
                     System.out.println("Por favor, ingrese solo números para el ID del plato.");
                 }
            }        
             
        Plate plateToUpdate = manager.menuOfRestaurant.getPlateById(plateIdToUpdate);
               if (plateToUpdate != null) {
                   double newPrice = 0;
                   boolean validNewPrice = false;
                   while (!validNewPrice) {
                       try {
                           System.out.println("Ingrese el nuevo precio del plato: ");
                           newPrice = Double.parseDouble(scanner.nextLine());
                           validNewPrice = true;
                       } catch (NumberFormatException e) {
                           System.out.println("Por favor, ingrese solo números para el nuevo precio.");
                         }
                 }

            plateToUpdate.updatePrice(newPrice);
            System.out.println("Precio actualizado exitosamente a: " + plateToUpdate.getPrice());
        } else {
            System.out.println("ID del plato no existe");
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
