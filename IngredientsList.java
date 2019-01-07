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
public class IngredientsList {
        String name;
        String unitOfMeasurement;
        double price;
        int ingredientCount = 0;
        ArrayList<IngredientsList> ingredientsList;
        
    public IngredientsList() {
        ingredientsList = new ArrayList<>();
    }
    
    public void addToIngredients(){
        ingredientCount++;
    }
    
    public void removeFromIngredients(){
        ingredientCount--;
    }
   
    
    
    public String getIngName() {
        return name;
    }

    public void setIngName(String name) {
        this.name = name;
    }

    public String getIngUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setIngUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public double getIngPrice() {
        return price;
    }

    public void setIngPrice(double price) {
        this.price = price;
    }
    
    void changeIngredient(Ingredient ing){
        int index = ingredientsList.indexOf(ing); //find out the index
        if(index > 0){
            ingredientCount--;
        }
        
    }
}   