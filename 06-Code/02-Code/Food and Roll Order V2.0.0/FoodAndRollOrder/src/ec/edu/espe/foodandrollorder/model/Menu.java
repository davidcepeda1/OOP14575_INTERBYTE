package ec.edu.espe.foodandrollorder.model;

import java.util.ArrayList;

public class Menu {
    private ArrayList <Plate> plateList;
        
    public Menu() {
    }    
    
    public Menu(ArrayList<Plate> plateList) {
        this.plateList = plateList;
    }

    @Override
    public String toString() {
        return "Menu:" +
                "{" + "plate=" + getPlateList() + '}';
    }

    /**
     * @return the plateList
     */
    public ArrayList <Plate> getPlateList() {
        return plateList;
    }

    /**
     * @param plateList the plateList to set
     */
    public void setPlateList(ArrayList <Plate> plateList) {
        this.plateList = plateList;
    }
    
    
}
