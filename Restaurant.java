/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmsimplegui;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author benharrison
 */
public class Restaurant {
//I will have all my recipes in here
    public static ArrayList<Recipe> allRecipes = new ArrayList<>();
    
    //the same for ingredients
    public static ArrayList<Ingredient> allIngredients = new ArrayList<>();
    
    public static DmSimplePanel2 recPanel;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //add some hardcoded ingredients
        Ingredient tomato;
        tomato = new Ingredient();
        tomato.setName("tomato");
        tomato.setUnitOfMeasurement("lb");
        tomato.setPrice(1.76);
        
        allIngredients.add(tomato);
        
        Ingredient basil;
        basil = new Ingredient();
        basil.setName("basil");
        basil.setUnitOfMeasurement("tsp");
        basil.setPrice(2.55);
        
        allIngredients.add(basil);
        
        
        Recipe soup = new Recipe();
        soup.setName("tomato soup");
        soup.addIngredient(basil, 3.4);
        soup.addIngredient(tomato, 1);
        
        allRecipes.add(soup);
    }
    
}

