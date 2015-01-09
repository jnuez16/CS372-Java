/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CookieSales;
import java.util.*;

/**
 *
 * @author jnuez16
 */
public class Cookies {
    private int number = 0;
    private String name;
    private Double cost;
    
    /**
     * <p> Simple constructor that sets the name and cost of the cookies </p>
     * @param name Name of the cookie
     * @param cost Cost per cookie
     */
    public Cookies(String name, Double cost)
    {
        setName(name);
        setCost(cost);
    }
    
    /**
     * <p> Adds number of cookies sold </p>
     * @param d Number of cookies (Int)
     */
    public void addItem(int d)
    {
        number += d;
    }
    
    /**
     * <p> calculates the total cost of the cookies sold </p>
     * @return Returns the total cost of the particular cookie as a double
     */
    public Double totalCost()
    {
        return (double)number*cost;
    }
    
    /**
     * <p> Gets the total number of cookies </p>
     * @return Returns the number of cookies sold
     */
    public int numItems()
    {
        return number;
    }
    
    /**
     * <p> Accessor function for name </p>
     * @return Returns the name of the cookie
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * <p> Mutator function for name </p>
     * @param name Name of the cookie
     */
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * <p> Accessor function for cost of the cookie </p>
     * @return Returns the cost of the cookies as a double
     */
    public Double getCost()
    {
        return cost;
    }
    /**
     * <p> Mutator function for the cost of the cookie </p>
     * @param cost Cost of the cookie (Double)
     */
    public void setCost(Double cost)
    {
        this.cost = cost;
    }
}
