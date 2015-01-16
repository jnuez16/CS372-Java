/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EventCalendar;

/**
 *
 * @author jnuez16
 */
public class Event {
    private String title;
    private String loc;
    private String date;
    
    public Event(String t, String l, String d)
    {
        title = t;
        loc = l;
        date = d;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getLoc()
    {
        return loc;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public void setTitle(String t)
    {
        title = t;
    }
    
    public void setLoc(String l)
    {
        loc = l;
    }
    
    public void setDate(String d)
    {
        date = d;
    }
}
