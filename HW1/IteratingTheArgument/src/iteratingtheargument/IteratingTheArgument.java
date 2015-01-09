/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iteratingtheargument;

/**
 *
 * @author jnuez16
 */
public class IteratingTheArgument {

    /**
     * @param args the command line arguments
     * <p> Takes in arguments from the console and outputs it </p>
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /**
         * <p>Checks if there's any data from the args variable and outputs it.</p>
         * PT: better to check that args.length > 3
         */
        if(args.length > 0)
        {
            System.out.printf("First word: %s\nSecond word: %s\nThird word: %s\n", args[0], args[1], args[2]);
        }
        

    }
    
}
