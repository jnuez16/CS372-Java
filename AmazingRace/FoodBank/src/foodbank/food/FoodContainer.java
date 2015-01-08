/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodbank.food;
import java.util.*;


/**
 *
 * @author jnuez16
 */
public class FoodContainer {
    private List<FoodItem> c = new ArrayList<FoodItem>();
    private int maxWeight = 100;
    private int maxVolume = 300;
    
    
    public boolean addItem(FoodItem x)
    {
        if((getWeight() + x.getWeight()) > maxWeight || (getVolume() + x.getVolume()) > maxVolume)
        {
            return true;
        }
        
        c.add(x);
        return false;
    }
    
    public int getCount()
    {
        return c.size();
    }
    
    public int getWeight()
    {
        int sum = 0;
        for(int i = 0; i < c.size(); i++)
        {
            sum += c.get(i).getWeight();
        }
        return sum;
    }
    
    public int getVolume()
    {
        int sum = 0;
        for(int i = 0; i < c.size(); i++)
        {
            sum += c.get(i).getVolume();
        }
        return sum;
    }
}
