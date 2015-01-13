/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gerbil_Map;
import gerbil_arraylist.*;
import java.util.*;

/**
 *
 * @author jnuez16
 */
public class Main {
    
    /**
     * <p>The main</p>
     * @param args 
     */
     public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Gerbil_ArrayList> ger = new HashMap<String, Gerbil_ArrayList>();
        String[] name = {"Lincoln", "Tesla", "Einstein", "Newton", "Leibniz"};
        List<String> names = new ArrayList<String>();
        
        for(int i = 0; i < name.length; i++)
        {
            //PT -- you don't need to track names. HashMap gives you a keySet, so
            //      you could iterate through that instead.
            names.add(name[i]);
            ger.put(name[i],new Gerbil_ArrayList(i));
        }
        
        Iterator e = names.iterator();
        
        while(e.hasNext())
        {
            String gerbil = (String)e.next();
            System.out.printf("%s is ", gerbil);
            ger.get(gerbil).hop();
        }
         
    }
}
