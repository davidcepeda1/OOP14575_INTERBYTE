package ec.edu.espe.foodandrollorders.view;

import java.util.Scanner;

public class FoodAndRollOrdersSystem {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int option;
            header();
            do {
                
                while (!scan.hasNextInt()) {
                    System.out.println("Error: Ingresa un numero entero valido.");
                    scan.next();
                }
                
                option = scan.nextInt();
                
                switch (option) {
                    case 1 -> {
                        user();
                        header();
                    }
                    
                    case 2 -> {
                        customer();
                        header();
                    }
                    
                    case 3 -> {
                        System.out.println("Exiting...");
                        break;
                    }
                    
                    default -> System.out.println("Invalid option. Please select a valid option.");
                }
            } while (option != 3);
        }
    }

    
    public static void customer(){
        try (Scanner scan = new Scanner(System.in)) {
            int option;
            header();
            do {
                
                while (!scan.hasNextInt()) {
                    System.out.println("Error: Ingresa un numero entero valido.");
                    scan.next();
                }
                
                option = scan.nextInt();
                
                switch (option) {
                    case 1 -> {
                        user();
                        header();
                    }
                    
                    case 2 -> {
                        customer();
                        header();
                    }
                    
                    case 3 -> {
                        System.out.println("Exiting...");
                        break;
                    }
                    
                    default -> System.out.println("Invalid option. Please select a valid option.");
                }
            } while (option != 3);
        }
    }
    
    
    
    
    public static void user(){
        
    }
    
    
    
    
    
    
    
    public static void header() {
        System.out.println("--------------------------");
        System.out.println("----------Wecolme---------");
        System.out.println("-------Food and Roll------");
        System.out.println("--------------------------");
        System.out.println("---------1. User----------");
        System.out.println("---------2. Orderds-------");
        System.out.println("---------3. Exit----------");
        System.out.println("--------------------------");
        System.out.println("-----Selecciona una opcion-----\n");
    }
    
    public static void headerUser(){
        System.out.println("--------------------------");
        System.out.println("-----User-----\n");
        System.out.println("--------------------------");
        System.out.println("-----User-----\n");
    }
    
    
    
}
