/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantreviewer;

/**
 *
 * @author jnuez_000
 */
public class Restaurant {
    private String name;
    private String address;
    private String notes;
    private int rate;
    
    public Restaurant(String name, String address, String notes, int rate)
    {
        setName(name);
        setAddress(address);
        setNotes(notes);
        setRate(rate);
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getNotes()
    {
        return notes;
    }
    public int getRate()
    {
        return rate;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public void setNotes(String notes)
    {
        this.notes = notes;
    }
    
    public void setRate(int rate)
    {
        this.rate = rate;
    }
    
}
