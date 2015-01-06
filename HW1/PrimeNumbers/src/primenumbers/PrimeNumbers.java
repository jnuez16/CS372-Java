/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primenumbers;
import java.util.Scanner;

/**
 *
 * @author jnuez16
 */
public class PrimeNumbers {
    static boolean prime = true;
    /**
     * @param args the command line arguments
     * <p>indicates which numbers are prime from a given integer value </p>
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter max range for prime search: ");
        int x = input.nextInt();
        
        primeNumber(x);
        
    }
    
    /**
     * 
     * @param max maximum range for the search
     * <p>Indicates the prime numbers from the given range </p>
     */
    public static void primeNumber(int max)
    {
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
