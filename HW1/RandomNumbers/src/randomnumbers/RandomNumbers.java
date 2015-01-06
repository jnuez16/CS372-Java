/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomnumbers;
import java.util.*;

/**
 *
 * @author jnuez16
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> randomNum = new ArrayList<Integer>();
        for(int i = 0; i < 25; i++)
        {
            randomNum.add((int)(Math.random()*100));
        }
        
        for(int i = 1; i < 25; i++)
        {
            if(randomNum.get(i-1) < randomNum.get(i))
            {
                System.out.printf("index %d is less than index %d\n", i-1, i);
            }
            else if(randomNum.get(i-1).equals(randomNum.get(i)))
            {
                System.out.printf("index %d is equal to index %d\n", i-1, i);
            }
            else
                System.out.printf("index %d is greater than index %d\n", i-1, i);
        }
    }
    
}
