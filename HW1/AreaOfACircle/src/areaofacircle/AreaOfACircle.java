/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package areaofacircle;
import java.util.Scanner;

/**
 *
 * @author jnuez16
 */
public class AreaOfACircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        final float PI = 3.14f;
        
        System.out.print("Enter radius: ");
        int radius = input.nextInt();
        
        double area = PI*radius*radius;
        System.out.printf("Area: %.4f\n", area);
    }
    
}
