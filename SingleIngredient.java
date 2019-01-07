/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmsimplegui;

import javax.swing.JOptionPane;

/**
 *
 * @author benharrison
 */
public class SingleIngredient extends javax.swing.JPanel {

    /**
     * Creates new form SingleIngredient
     */
    public SingleIngredient() {
        initComponents();
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    //this links a particular panel to its corresponding ingredient
    //also changes the label to show the name of the ingredient
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
        
        //change the name of the label
        nameLabel.setText(ingredient.toString());
    }
    
    //this sets the quantity of the particular ingredient ... mostly adds it to the textfield
    public void setQuantity(double q){
        quantity.setText(q + "");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        nameLabel.setText("Name");

        jLabel2.setText("Quantity:");

        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Modify");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         //try and convert the textfield quantity to a double
        try{
            String t = quantity.getText(); //get the user-entered text
            double q = Double.parseDouble(t); //try to convert
            // if I get past here the conversion worked
            
            // get the selected recipe from the recipe panel
            Recipe rec = Restaurant.recPanel.getSelectedRecipe();
            
            // change the recipe in memory
            rec.changeIngredient(ingredient, q); 
            
            Restaurant.recPanel.updateIngredients();
            Restaurant.recPanel.updateRecipes();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please enter a number as the quantity", 
                    "Error Modifying Recipe", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // get the selected recipe from the recipe panel
        Recipe rec = Restaurant.recPanel.getSelectedRecipe();
            
        // change the recipe in memory
        rec.removeIngredient(ingredient);
        
        Restaurant.recPanel.updateRecipes();
        Restaurant.recPanel.setSelectedRecipe(rec);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField quantity;
    // End of variables declaration//GEN-END:variables
    
    private Ingredient ingredient; //keeps the ingredient associated to this small panel
}