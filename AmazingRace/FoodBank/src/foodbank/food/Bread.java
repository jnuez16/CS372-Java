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
public class Bread extends FoodItem {
    
    public Bread(int weight, int volume)
    {
        super(weight, volume);
    }
    
    public void ToastIt()
    {
        System.out.println("Hey man... I'm really baked!");
    }
    
    public String toString()
    {
        return "Hi this is Bread!\n";
    }
    
}
