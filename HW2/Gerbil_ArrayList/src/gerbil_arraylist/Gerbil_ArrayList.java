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
