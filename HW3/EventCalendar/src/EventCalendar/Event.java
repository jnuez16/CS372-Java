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

    /**
     * Simple constructor to initialize properties
     * @param t title
     * @param l location
     * @param d date
     */
    public Event(String t, String l, String d) {
        title = t;
        loc = l;
        date = d;
    }
    
    /**
     * Accessor function for title
     * @return Returns string for title
     */
    public String getTitle() {
        return title;
    }
    /**
     * Accessor function for location
     * @return 
     */
    public String getLoc() {
        return loc;
    }

    /**
     * Accessor function for date
     * @return 
     */
    public String getDate() {
        return date;
    }

    /**
     * mutator function for title
     * @param t 
     */
    public void setTitle(String t) {
        title = t;
    }

    /**
     * mutator function for location
     * @param l 
     */
    public void setLoc(String l) {
        loc = l;
    }

    /**
     * mutator function for date
     * @param d 
     */
    public void setDate(String d) {
        date = d;
    }
}
