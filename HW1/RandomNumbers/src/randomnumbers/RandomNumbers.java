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
     * <p>Generates random numbers and puts it in the array </p>
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> randomNum = new ArrayList<Integer>();
        Random r = new Random();
        int randomNum2 = r.nextInt(100);
        for(int i = 0; i < 25; i++)
        {
            randomNum.add(r.nextInt(100));
        }
        
        compare(randomNum, randomNum2);
        
    }
    
    /**
     * <p>Compares the values from an array of integers to a random integer </p> 
     * @param randomNum an array of randomly generated integers
     * @param randomNum2 a randomly generated integer
     *
     */
    public static void compare(ArrayList<Integer> randomNum, int randomNum2)
    {
        for(int i = 0; i < 25; i++)
        {
            if(randomNum.get(i) < randomNum2)
            {
                System.out.printf("%d is less than %d\n", randomNum.get(i), randomNum2);
            }
            else if(randomNum.get(i).equals(randomNum2))
            {
                System.out.printf("%d is equal to %d\n", randomNum.get(i), randomNum2);

            }
            else
                System.out.printf("%d is greater than %d\n", randomNum.get(i), randomNum2);
        }
    }
}
