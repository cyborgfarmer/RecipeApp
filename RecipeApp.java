package recipeapp;

import java.util.ArrayList;
import java.util.Scanner;

public class RecipeApp {

    private static Scanner scanner = new Scanner(System.in);
    private static Ingredient ingredientList = new Ingredient();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    ingredientList.printIngredients();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the ingredients.");
        System.out.println("\t 2 - To add an ingredient.");
        System.out.println("\t 3 - To modify an ingredient.");
        System.out.println("\t 4 - To remove an ingredient.");
    }

    public static void addItem() {
        System.out.println("Please enter the ingredient: ");
        ingredientList.addIngredient(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Current ingredient: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement ingredient: ");
        String newItem = scanner.nextLine();
        ingredientList.modifyIngredients(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter ingredient name: ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        ingredientList.removeIngredients(itemNo);
    }
}
