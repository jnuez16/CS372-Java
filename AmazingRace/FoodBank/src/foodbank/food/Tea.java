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
public class Tea extends FoodItem{
    
    public Tea(int weight, int volume)
    {
        super(weight, volume);
    }
    
    public void Steeping()
    {
        System.out.println("It's steeping...");
    }
    
    public String toString()
    {
        return "Which letter is delicious? It's Tea!!\n";
    }
}
