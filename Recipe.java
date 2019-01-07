/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmsimplegui;

import java.util.ArrayList;

/**
 *
 * @author benharrison
 */
public class Recipe {
    String name;
    ArrayList<Ingredient> ingredient;
    ArrayList<Double> quantities;
    
    public Recipe(){
        ingredient = new ArrayList<>();
        quantities = new ArrayList<>();
    }
    
    public int getNumberOfIngredients(){
        return ingredient.size();
    }
    
    //returns the i-th ingredient
    public Ingredient getIngredient(int i){
        return ingredient.get(i);
    }

    //returns the quantity for the i-th ingredient
    public double getQuantity(int i){
        return quantities.get(i);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addIngredient(Ingredient ing, double howMuch){
        ingredient.add(ing);
        quantities.add(howMuch);
        
        ing.addedToRecipe(); // do not forget to tell the ingredient it's been added
        
        // return statement required, here, after changing this function from void
        // to Ingredient in order to clear an error in addToRecipeButton in
        // DmSimplePanel2 for ing = rec.addIngredient(ing, howMuch);
        // OG error was that void could not become Ingredient. Much of this
        // follows changing IngredientsList to Ingredient to remove from
        // the program. Not sure that led to an error though, as it seemed
        // to fix several bugs. ??? ;
    }
    
    void removeIngredient(int index){ //no error checking on index being valid
        Ingredient ing = ingredient.get(index);
        ing.removedFromRecipe(); //do not forget to tell the ingredient it's out
        
        ingredient.remove(index);
        quantities.remove(index);
    }
    
    void removeIngredient(Ingredient ing){
        int index = ingredient.indexOf(ing); //find out the index
        
        if(index != -1)
            removeIngredient(index); //do the work in the previous function
    }
    
    void changeIngredient(Ingredient ing, double newQuantity){
        int index = ingredient.indexOf(ing); //find out the index
        quantities.set(index, newQuantity);
    }
    
    double computeCost(){
        double total = 0;
        for(int i=0; i < ingredient.size(); i++){
            total = total + ingredient.get(i).getPrice() * quantities.get(i);
        }
        return total;
    }
    
    @Override
    public String toString(){
        
        //first add the names of all ingreidients in a string
        String names = "";
        for(int i=0; i < ingredient.size(); i++){
            names = names + ingredient.get(i).getName() + ", ";
        }
        //done
        
        
        return name + ", $" + computeCost() + " (" + names + ")";
    }
    
}