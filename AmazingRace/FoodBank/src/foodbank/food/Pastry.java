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
public class Pastry extends FoodItem{
    
    public Pastry(int weight, int volume)
    {
        super(weight, volume);
    }
    
    public void Nibble()
    {
        System.out.println("That's weird... It's still warm!");
    }
    
    public String toString()
    {
        return "Hi! I'm Pastry!\n";
    }
}
