/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculatingpi;

import java.util.Scanner;

/**
 *
 * @author jnuez16
 */
public class Main {
    
    
        public static void main(String[] args) {
        // TODO code application logic here
        CalculatingPi Pie = new CalculatingPi();
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of terms: ");
        
        int x = input.nextInt();
        Pie.evaluate(x);
        
        for(int i = 0; i < Pie.getSize(); i++)
        {
            System.out.printf("Term %d: %.12f\n", i+1, Pie.getTerms().get(i));
        }
        Pie.clear();
    }
}
