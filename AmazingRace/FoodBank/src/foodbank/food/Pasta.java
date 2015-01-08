/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodbank.food;

/**
 *
 * @author jnuez16
 */
public class Pasta extends FoodItem {
    
    public Pasta(int weight, int volume)
    {
        super(weight, volume);
    }
    
    public void Strain()
    {
        System.out.println("This is such a strain.");
    }
    
    public String toString()
    {
        return "Hi this is Pasta!\n";
    }
    
}
