/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restaurantreviewer;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jnuez16
 */
public class Popup {
    Restaurant _rest;
    
    public void display(String name, String addr, String notes, int rate)
    {
        JPanel panel = new JPanel(new GridLayout(0,1));
        

        
        panel.add(new JLabel(String.format("Name: %s", name)));
        panel.add(new JLabel(String.format("Address: %s", addr)));
        panel.add(new JLabel(String.format("Rate: %d", rate)));
        panel.add(new JLabel(String.format("Notes: %s", notes)));
        
        JOptionPane.showMessageDialog(null, panel);

    }
}
