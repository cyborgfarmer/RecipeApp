/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmsimplegui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dm360
 */
public class DmSimpleGUI2 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Restaurant.main(args);
        
        JFrame frame = new JFrame("DM Visual GUI");
        
        DmSimplePanel2 p = new DmSimplePanel2();
        
        Restaurant.recPanel = p;
        
        frame.add(p);
        
        frame.setSize(820, 740);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}

