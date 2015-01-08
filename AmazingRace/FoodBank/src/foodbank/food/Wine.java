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
public class Wine extends FoodItem {
    
    private String productionDate = "January 7, 2015";
    private String taste = "sweet";
    
    public Wine(int weight, int volume)
    {
        super(weight, volume);
    }
    
    public String getDate()
    {
        return productionDate;
    }
    
    public String getTaste()
    {
        return taste;
    }
    
    public String toString()
    {
        return "Yeah... I'm Wine.\n";
    }
}
