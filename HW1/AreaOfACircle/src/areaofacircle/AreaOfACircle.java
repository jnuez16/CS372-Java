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
    final static float PI = 3.14f;
    /**
     * @param args the command line arguments
     * <p>Prompts for radius</p>
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter radius: ");
        int radius = input.nextInt();
        
        double area = CalcArea(radius);
        System.out.printf("Area: %.4f\n", area);
    }
    /**
     * 
     * @param radius as inputed by the user
     * @return Area of the circle (double)
     */
    public static double CalcArea(int radius)
    {    
        return PI*radius*radius;
    }
}
