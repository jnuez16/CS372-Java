/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataonly;
//import java.util.Scanner;

/**
 *
 * @author jnuez16
 */


public class DataOnly {
    
    int i;
    float f;
    boolean b;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   
        
        //an object of the class DataOnly
        DataOnly d = new DataOnly();

        
        //initializes the values of the
        d.i = 314;
        d.f = 3.1415f;
        d.b = false;

        //Outputs the values
        System.out.printf("DataOnly has the following values:\n\tinteger = %d;\n\tfloat = %.4f;\n"
                + "\tboolean = %b \n", d.i, d.f, d.b);
        
        
        
    }
    
}
