/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EventCalendar;

import java.util.Comparator;

/**
 *
 * @author jnuez16
 */
public class EventCompararor implements Comparator<Event>{

    /**
     * Comparator for sorting
     * @param o1
     * @param o2
     * @return 
     */
    @Override
    public int compare(Event o1, Event o2) {
        return o1.getTitle().compareToIgnoreCase(o2.getTitle());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
