package ec.edu.espe.foodandrollorder.model;

import java.util.ArrayList;

public class Menu {
    private ArrayList <Plate> plateListTallarin;
    private ArrayList<Plate> plateListMariscos;

    @Override
    public String toString() {
        return "Menu{" + 
                "Tallarin=" + plateListTallarin + 
                "Mariscos=" + plateListMariscos 
                + '}';
    }        
    
    
    public Menu(ArrayList<Plate> plateListTallarin, ArrayList<Plate> plateListMariscos) {
        this.plateListTallarin = plateListTallarin;
        this.plateListMariscos = plateListMariscos;
    }
  
    public Menu menuOfRestaurant () {
                                        
           Plate tallarinPlate1 = new Plate ("Tallarin Especial","Pollo, Lomo, Camaron y verduras",5.60,"SI","10 min");
           Plate tallarinPlate2 = new Plate ("Tallarin Salteado con Pollo","Pollo y verduras",5.70,"SI","5 min");   
                        
           Plate mariscosPlate1 = new Plate ("Calamar salteado con Legumbres ","Calamar",5.60,"Sí","5min");
           Plate mariscosPlate2 = new Plate ("Calamar y Camarón salteado con Legumbres","Calamar y Camarón",5.70,"Sí","10min");   
           
            plateListTallarin.add(tallarinPlate1);
            plateListTallarin.add(tallarinPlate2);
            
            plateListMariscos.add(mariscosPlate1);
            plateListMariscos.add(mariscosPlate2);
            
            Menu menuOfRestaurant = new Menu(plateListTallarin, plateListMariscos);                          
            return menuOfRestaurant;
        }
    
    public void displayFullMenu() {
             System.out.println("======== Menu de Tallarines ========");
             System.out.println("ID\tNombre\t\tDescripción\t\tPrecio\t\tDisponibilidad\t\tTiempo de preparación");
             displayMenu(plateListTallarin);

             System.out.println("\n======== Menu de Mariscos ========");
             System.out.println("ID\tNombre\t\tDescripción\t\tPrecio\t\tDisponibilidad\t\tTiempo de preparación");
             displayMenu(plateListMariscos);
          }

    private void displayMenu(ArrayList<Plate> plateList) {
        for (Plate plate : plateList) {
            System.out.printf("%d\t%s\t\t%s\t\t%.2f\t\t%s\t\t%s\n",
                    plate.getId(), plate.getName(), plate.getDescription(), plate.getPrice(),
                    plate.getAvailability(), plate.getPreparationTime());
        }
    }
        
         public void addPlateToListTallarin(Plate plate) {
             this.plateListTallarin.add(plate);
         }
         
         public void addPlateToListMariscos(Plate plate) {
             this.plateListMariscos.add(plate);
         }
         
         public void removePlateById(int plateId) {
            plateListTallarin.removeIf(plate -> plate.getId() == plateId);
            plateListMariscos.removeIf(plate -> plate.getId() == plateId);
        }
         
        public Plate getPlateById(int plateId) {            
            for (Plate plate : plateListTallarin) {
                if (plate.getId() == plateId) {
                    return plate;
                }
            }

            for (Plate plate : plateListMariscos) {
                if (plate.getId() == plateId) {
                    return plate;
                }
            }

            return null;
        }      
         
        public ArrayList <Plate> getPlateListTallarin() {
            return plateListTallarin;
         }

         public void setPlateListTallarin(ArrayList <Plate> plateListTallarin) {
             this.plateListTallarin = plateListTallarin;
        }

         public ArrayList<Plate> getPlateListMariscos() {
            return plateListMariscos;
        }

        public void setPlateListMariscos(ArrayList<Plate> plateListMariscos) {
            this.plateListMariscos = plateListMariscos;
        }
        
}
