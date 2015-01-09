/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculatingpi;
import java.util.*;

/**
 *
 * @author jnuez16
 */
public class CalculatingPi {

    
    public double pi = 0;
    List<Double> Pi = new ArrayList<Double>();
    
    /**
     * <p>Constructor calculating the values of pi and storing each term in an array</p>
     * @param numTerms 
     */
    public CalculatingPi(int numTerms)
    {
        
        for(int i = 0; i < numTerms; i++)
        {
            pi += (Math.pow(-1, i))*(4/(double)(2*(i)+1));
            Pi.add(pi);
        }
    }
    
    /**
     * <p>Accessor method for the Array of Pi values</p>
     * @return Returns a list of pi values based on specified number of terms
     */
    public List<Double> getTerms()
    {
        return Pi;
    }
    /**
     * <p>Accessor method for the array size</p>
     * @return Returns the size of the array
     */
    public int getSize()
    {
        return Pi.size();
    }
    
    /**
     * <p>Accessor method for the latest value of pi</p>
     * @return Returns the last term value of pi
     */
    
    public double getPi()
    {
        return pi;
    }
    /**
     * @param args the command line arguments
     */

    
}
