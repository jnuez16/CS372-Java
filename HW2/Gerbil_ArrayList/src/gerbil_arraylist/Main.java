/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerbil_arraylist;

import java.util.ArrayList;

/**
 *
 * @author jnuez16
 */
public class Main {
     /**
     * @param args the command line arguments
     * <p>Creates a gerbil object and initializes it. </p>
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Gerbil_ArrayList> gerbil = new ArrayList<Gerbil_ArrayList>();
        
        for(int i = 0; i < 25; i++)
        {
            gerbil.add(new Gerbil_ArrayList(i+1));
        }
        for(int i = 0; i < 25; i++)
        {
            gerbil.get(i).hop();
        }
        
    }
}
