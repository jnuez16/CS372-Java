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
public class Gerbil_ArrayList {

    private int gerbilNumber;
    /**
     * 
     * @param gerbilNumber an ID number for the gerbil
     * <p>Constructor initializing the gerbil ID number </p>
     */
    public Gerbil_ArrayList(int gerbilNumber)
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
    
}
