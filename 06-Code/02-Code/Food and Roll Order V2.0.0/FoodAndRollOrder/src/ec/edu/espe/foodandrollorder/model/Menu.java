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
                                        
           Plate tallarinPlate1 = new Plate ("Tallarín Especial","Pollo, Lomo, Camarón y verduras",5.60,"SI","10 min");
           Plate tallarinPlate2 = new Plate ("Tallarín Salteado con Pollo","Pollo y verduras",5.70,"SI","5 min");   
                        
           Plate mariscosPlate1 = new Plate ("Calamar salteado con Legumbres ","Calamar",5.60,"Sí","5min");
           Plate mariscosPlate2 = new Plate ("Calamar y Camarón salteado con Legumbres","Calamar y Camarón",5.70,"Sí","10min");   
           
            plateListTallarin.add(tallarinPlate1);
            plateListTallarin.add(tallarinPlate2);
            
            plateListMariscos.add(mariscosPlate1);
            plateListMariscos.add(mariscosPlate2);
            
            Menu menuOfRestaurant = new Menu(plateListTallarin, plateListMariscos);                          
            return menuOfRestaurant;
        }
        
         public void addPlateToListTallarin(Plate plate) {
             this.plateListTallarin.add(plate);
         }
         
         public void removePlateById(int plateId) {
            plateListTallarin.removeIf(plate -> plate.getId() == plateId);
            plateListMariscos.removeIf(plate -> plate.getId() == plateId);
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
