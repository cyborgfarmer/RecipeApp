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
public class Ingredient {
    String name;
    String unitOfMeasurement;
    double price;
    int ingredientCount = 0;
    int recipeCount = 0; //counts the number of recipes this ingredient is in

    public void addedToRecipe(){
        recipeCount++;
    }
    
    public void removedFromRecipe(){
        recipeCount--;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        String star;
        
        if(recipeCount == 0)
            star = "*";
        else
            star = "";
        
        return star + name + " ($" + price +"/" + unitOfMeasurement + ")";
    }
    
    }

