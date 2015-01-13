/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerbil_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import gerbil_arraylist.*;  //PT -- good!

/**
 *
 * @author jnuez16
 */
public class Main {
    /**
     * @param args the command line arguments
     * <p>Creates an array of gerbil objects, initializes it, and uses iterators to move through the list. </p>
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Gerbil_ArrayList> gerbil = new ArrayList<Gerbil_ArrayList>();
        
        for(int i = 0; i < 25; i++)
        {
            gerbil.add(new Gerbil_ArrayList(i+1));
        }
        
        Iterator e = gerbil.iterator();
        while(e.hasNext())
        {
            ((Gerbil_ArrayList)e.next()).hop();
        }
    }
}
