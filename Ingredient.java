package recipeapp;

import java.util.ArrayList;

/**
 *
 * @author benharrison
 */
import java.util.ArrayList;

public class Ingredient {

    private ArrayList<String> ingredientList = new ArrayList<String>();

    public void addIngredient(String item) {
        ingredientList.add(item);
    }

    public ArrayList<String> getIngredientList() {
        return ingredientList;
    }

    public void printIngredients() {
        System.out.println("You have " + ingredientList.size() + " items in "
                + "your recipe.");
        for(int i = 0; i < ingredientList.size(); i++) {
            System.out.println((i + 1) + ". " + ingredientList.get(i));
        }
    }

    public void modifyIngredients(String currentItem, String newItem) {
        int position = findIngredient(currentItem);
        if (position >= 0) {
            modifyIngredients(position, newItem);
        }
    }

    private void modifyIngredients(int position, String newItem) {
        ingredientList.set(position, newItem);
        System.out.println("Ingredient " + (position + 1) + " has been "
                + "modified.");
    }

    public void removeIngredients(String item) {
        int position = findIngredient(item);
        if (position >= 0) {
            removeIngredients(position);
        }
    }

    private void removeIngredients(int position) {
            ingredientList.remove(position);
    }

    private int findIngredient(String searchItem) {
        return ingredientList.indexOf(searchItem);
        }

        public boolean onFile(String searchItem) {
        int position = findIngredient(searchItem);
        if(position >= 0) {
            return true;
        }
        return false;
    }


}