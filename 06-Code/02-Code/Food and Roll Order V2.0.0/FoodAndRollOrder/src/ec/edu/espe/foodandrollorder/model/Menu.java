package ec.edu.espe.foodandrollorder.model;

import java.util.ArrayList;

public class Menu {
    private ArrayList <Plate> plateListTallarin;
    private ArrayList<Plate> plateListMariscos;
        
    public Menu() {
    }    

    public Menu(ArrayList<Plate> plateListTallarin, ArrayList<Plate> plateListMariscos) {
        this.plateListTallarin = plateListTallarin;
        this.plateListMariscos = plateListMariscos;
    }

    @Override
    public String toString() {
        return "Menu{" + "plateListTallarin=" + plateListTallarin + ", plateListMariscos=" + plateListMariscos + '}';
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
