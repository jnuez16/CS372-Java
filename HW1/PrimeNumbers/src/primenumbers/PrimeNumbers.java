/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primenumbers;

/**
 *
 * @author jnuez16
 */
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean prime = true;
        
        for(int i = 2; i <= 1000; i++)
        {
            for(int j = 2; j < i; j++)
            {
                if(i == 2)
                {
                    prime = true;
                }
                else if(i%j == 0)
                {
                    prime = false;
                }
            }
            if(prime)
            {
                System.out.printf("%d is prime!\n", i);
            }
            prime = true;
        }
    }
    
}
