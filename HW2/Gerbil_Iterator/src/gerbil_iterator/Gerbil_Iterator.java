/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerbil_iterator;

import java.util.*;

/**
 *
 * @author jnuez16
 */
public class Gerbil_Iterator {

private int gerbilNumber;
    /**
     * 
     * @param gerbilNumber an ID number for the gerbil
     * <p>Constructor initializing the gerbil ID number </p>
     */
    public Gerbil_Iterator(int gerbilNumber)
    {
        this.gerbilNumber = gerbilNumber;
    }
    
    /**
     * <p>Outputs the gerbil number and that it's hopping </p>
     */
    public void hop()
    {
        System.out.printf("Gerbil %d is hopping mad!\n", gerbilNumber);
    }
    /**
     * @param args the command line arguments
     * <p>Creates an array of gerbil objects, initializes it, and uses iterators to move through the list. </p>
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Gerbil_Iterator> gerbil = new ArrayList<Gerbil_Iterator>();
        
        for(int i = 0; i < 25; i++)
        {
            gerbil.add(new Gerbil_Iterator(i+1));
        }
        
        Iterator e = gerbil.iterator();
        while(e.hasNext())
        {
            ((Gerbil_Iterator)e.next()).hop();
        }
    }
    
}
