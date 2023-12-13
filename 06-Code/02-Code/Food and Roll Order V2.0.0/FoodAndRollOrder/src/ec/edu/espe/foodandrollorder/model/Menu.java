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
  
     public Menu() {
        this.plateListTallarin = new ArrayList<>();
        this.plateListMariscos = new ArrayList<>();
    }

    public Menu menuOfRestaurant () {
           
           Menu menuOfRestaurant = new Menu ();                             
           
           Plate tallarinPlate1 = new Plate ("Tallarin y legumbres 1","Pollo,Lomo,Camarón",5.60,"SI","10 min");
           Plate tallarinPlate2 = new Plate ("Tallarin y legumbres 2","Pollo, verduras",5.70,"SI","5 min");   
           Plate tallarinPlate3 = new Plate ("Tallarin y legumbres 3","Camarón,verduras",5.70,"SI","5 min");
           Plate tallarinPlate4 = new Plate ("Tallarin y legumbres 4","Tallarin y verduras",5.70,"SI","5 min");
                        
           Plate mariscosPlate1 = new Plate ("Mariscos y Legumbres 1","Calamar y verduras",6.80,"Sí","5 min");
           Plate mariscosPlate2 = new Plate ("Mariscos y Legumbres 2","Calamar y Camarón",7.80,"Sí","5 min");   
           Plate mariscosPlate3 = new Plate ("Mariscos y Legumbres 3","Calamar y Camarón",8.50,"Sí","5 min");   
           
            plateListTallarin.add(tallarinPlate1);
            plateListTallarin.add(tallarinPlate2);
            plateListTallarin.add(tallarinPlate3);
            plateListTallarin.add(tallarinPlate4);
            
            plateListMariscos.add(mariscosPlate1);
            plateListMariscos.add(mariscosPlate2);
            plateListMariscos.add(mariscosPlate3);
            
           menuOfRestaurant.setPlateListTallarin(plateListTallarin);
           menuOfRestaurant.setPlateListMariscos(plateListMariscos);
                                             
            return menuOfRestaurant;
        }
    
        public void displayFullMenu() {
           System.out.println("======== Menú de Tallarines ========");
           displayHeader();
           displayMenu(plateListTallarin);

           System.out.println("\n======== Menú de Mariscos ========");
           displayHeader();
           displayMenu(plateListMariscos);
         }

       private void displayHeader() {
           System.out.println("---------------------------------------------------------------------------------------------");
           System.out.printf("| %-3s | %-20s | %-40s | %-10s | %-15s | %-20s |\n",
                   "ID", "Nombre", "Descripción", "Precio", "Disponibilidad", "Tiempo de preparación");
           System.out.println("---------------------------------------------------------------------------------------------");
         }

       private void displayMenu(ArrayList<Plate> plateList) {
           for (Plate plate : plateList) {
               System.out.printf("| %-3d | %-20s | %-40s | %-10.2f | %-15s | %-20s |\n",
                       plate.getId(), plate.getName(), plate.getDescription(), plate.getPrice(),
                       plate.getAvailability(), plate.getPreparationTime());
           }
           System.out.println("---------------------------------------------------------------------------------------------");
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
