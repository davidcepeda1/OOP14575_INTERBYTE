package ec.edu.espe.foodandrollorder.model;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Menu {

    private ArrayList<Plate> plateListTallarin;
    private ArrayList<Plate> plateListMariscos;

    @Override
    public String toString() {
        return "Menu{"
                + "Tallarin=" + plateListTallarin
                + "Mariscos=" + plateListMariscos
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

    public Menu menuOfRestaurant() {

        Menu menuOfRestaurant = new Menu();

        Plate tallarinPlate1 = new Plate("Tallarin Especial", "Pollo, Lomo, Camaron y verduras", 5.60, "SI", "10 min");
        Plate tallarinPlate2 = new Plate("Tallarin Salteado con Pollo", "Pollo y verduras", 5.70, "SI", "5 min");
        Plate tallarinPlate3 = new Plate("Tallarin y legumbres 3", "Camarón,verduras", 5.70, "SI", "5 min");
        Plate tallarinPlate4 = new Plate("Tallarin y legumbres 4", "Tallarin y verduras", 5.70, "SI", "5 min");
        plateListTallarin.add(tallarinPlate1);
        plateListTallarin.add(tallarinPlate2);
        plateListTallarin.add(tallarinPlate3);
        plateListTallarin.add(tallarinPlate4);

        menuOfRestaurant.setPlateListTallarin(plateListTallarin);

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

    public void saveMenuAsJson(String fileName) {
        Gson gson = new Gson();
        String jsonMenu = gson.toJson(this);

        try (FileWriter fileWrite = new FileWriter(fileName)) {
            fileWrite.write(jsonMenu);
            System.out.println("Menu data successfully saved to file  " + fileName + " '. ");
        } catch (IOException e) {
            System.out.println("Error saving the Json file " + e.getMessage());
        }

    }

    public Menu readMenuFromJson(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder jsonData = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonData.append(line);
            }

            Gson gson = new Gson();
            return gson.fromJson(jsonData.toString(), Menu.class);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
            return null;
        }
    }

    public ArrayList<Plate> getPlateListTallarin() {
        return plateListTallarin;
    }

    public void setPlateListTallarin(ArrayList<Plate> plateListTallarin) {
        this.plateListTallarin = plateListTallarin;
    }

    public ArrayList<Plate> getPlateListMariscos() {
        return plateListMariscos;
    }

    public void setPlateListMariscos(ArrayList<Plate> plateListMariscos) {
        this.plateListMariscos = plateListMariscos;
    }

}
