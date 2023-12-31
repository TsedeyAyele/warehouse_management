package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean running = true;

    public static void main(String[] args) {
        WarehouseManager warehouseManager = new WarehouseManager();

        addInitialWarehouses(warehouseManager);

        int selection = 0;
        while (running) {
            selection = getMainMenuSelection();

            handleMenuSelection(selection, warehouseManager);
        }

    }

    /**
     * Adds a few warehouses to the warehouse manager
     *
     * @param warehouseManager The warehouse manager to add warehouses to
     */
    private static void addInitialWarehouses(WarehouseManager warehouseManager) {
        // Add initial warehouses
        Warehouse kista = new Warehouse(1, "Kista");
        Warehouse gothenburg = new Warehouse(2, "Gothenburg");
        Warehouse stockholm = new Warehouse(3, "Stockholm");

        warehouseManager.addNewWarehouse(kista);
        warehouseManager.addNewWarehouse(gothenburg);
        warehouseManager.addNewWarehouse(stockholm);
    }

    /**
     * Shows the main menu to the user and returns the selection
     *
     * @return The users selection
     */

    private static int getMainMenuSelection() {
        while (true) {
            try {
                System.out.println("\n\n------MENU------\n" +
                        "1. Show warehouses\n" +
                        "2. Add warehouse\n" +
                        "3. Add product\n" +
                        "4. Add product to warehouse\n" +
                        "0  Exit\n" +
                        "Select:");

                String input = scanner.nextLine();
                return Integer.parseInt(input);

            } catch (NumberFormatException exception) {
                System.out.println("Invalid input! Please enter a number");
            }
        }
    }

    private static void handleMenuSelection(int selection, WarehouseManager warehouseManager) {
        switch (selection) {
            case 1:
                printAllWarehouses(warehouseManager);
                break;
            case 2:
                addWarehouseToManager(warehouseManager);
                break;
            case 0:
                stopRunning();
                break;
            default:
                System.out.println("Invalid menu selection");
        }
    }

    /**
     * Print all warehouses
     *
     * @param warehouseManager The warehouse manager to print warehouses of
     */
    private static void printAllWarehouses(WarehouseManager warehouseManager) {
        var warehouses = warehouseManager.getAllWarehouses();

        printWarehouses(warehouses);
    }

    /**
     * Prints all warehouses in the list
     *
     * @param warehouses A list of warehouses to print
     */
    private static void printWarehouses(ArrayList<Warehouse> warehouses) {
        for (Warehouse warehouse : warehouses) {
            System.out.println(warehouse);
        }
    }

    private static void addWarehouseToManager(WarehouseManager warehouseManager) {

        Warehouse newWarehouse = getWarehouseFromUserInput();
        warehouseManager.addNewWarehouse(newWarehouse);
        System.out.println("Warehouse added successfully!");

    }

    private static Warehouse getWarehouseFromUserInput() {
        System.out.print("Input location");
        String location = scanner.nextLine();
        Warehouse newWarehouse = new Warehouse(location);

        return newWarehouse;
    }

    private static void stopRunning(){
        running = false;
        System.out.println("Program will stop now.\n"+
                "Have a great day!");
    }
}