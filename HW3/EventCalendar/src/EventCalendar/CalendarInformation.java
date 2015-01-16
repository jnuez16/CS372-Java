/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventCalendar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;

/**
 *
 * @author jnuez_000
 */
public class CalendarInformation {
//    private Vector<String> title = new Vector<String>();
//    private Vector<String> loc = new Vector<String>();
//    private Vector<String> date = new Vector<String>();
    private Vector<Event> ev = new Vector<Event>();
    private DefaultListModel<String> model1 = new DefaultListModel<String>();
    private DefaultListModel<String> model2 = new DefaultListModel<String>();
    private DefaultListModel<String> model3 = new DefaultListModel<String>();
    private File f = new File("Calendar.txt");
    /**
     * Constructor that takes in information from file
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public CalendarInformation() throws FileNotFoundException, IOException
    {
        String t = "";
        String l = "";
        String d = "";
        try{
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String line;
            while((line = rdr.readLine()) != null)
            {
                Pattern p = Pattern.compile("title: (.*)<t>");
                Matcher m = p.matcher(line);
                while(m.find())
                {
                    t = m.group(1);
                }
                
                p = Pattern.compile("location: (.*)<l>");
                m = p.matcher(line);
                while(m.find())
                {
                    l = m.group(1);
                }
                
                p = Pattern.compile("Date: (.*)<d>");
                m = p.matcher(line);
                while(m.find())
                {
                    d = m.group(1);
                }
                ev.add(new Event(t,l,d));
            }
            rdr.close();
        }
        catch(FileNotFoundException ex)
        {
            
        }
        catch(IOException ex)
        {
            
        }
        
    }
    
    /**
     * Updates File
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void update() throws FileNotFoundException, IOException
    {
        try{
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f));
            for(int i = 0; i < ev.size(); i++)
            {
                wrtr.write(String.format("title: %s<t> location: %s<l> Date: %s<d>\n", ev.get(i).getTitle(), ev.get(i).getLoc(), ev.get(i).getDate()));
            }
            rdr.close();
            wrtr.close();  
        }
        catch(FileNotFoundException ex)
        {
            
        }
        catch(IOException ex)
        {
            
        }
    }
    
    /**
     * Add titles to a model for a JList
     * @return DefaultListModel for JList
     */
    public DefaultListModel<String> getTitleList()
    {
        model1.removeAllElements();
        for(int i = 0; i < ev.size(); i++)
        {
            model1.addElement(ev.get(i).getTitle());
        }
        return model1;
    }
    /**
     * Add location to a model for a JList
     * @return DefaultListModel for JList
     */
    public DefaultListModel<String> getLocList()
    {
        model2.removeAllElements();
        for(int i = 0; i < ev.size(); i++)
        {
            model2.addElement(ev.get(i).getLoc());
        }
        return model2;
    }
    /**
     * Add date to a model for a JList
     * @return DefaultListModel for JList
     */
    public DefaultListModel<String> getDateList()
    {
        model3.removeAllElements();;
        for(int i = 0; i< ev.size(); i++)
        {
            model3.addElement(ev.get(i).getDate());
        }
        return model3;
    }
    
    /**
     * Adds information to a vector of events
     * @param title
     * @param loc
     * @param Date 
     */
    public void addInfo(String title, String loc, String Date)
    {
        ev.add(new Event(title, loc, Date));
    }
    
    /**
     * 
     * @return Returns vector of events 
     */
    public Vector<Event> getEvent()
    {
        return ev;
    }
    
//    public Vector<String> getTitle()
//    {
//        return title;
//    }
//    
//    public Vector<String> getLoc()
//    {
//        return loc;
//    }
//    
//    public Vector<String> getDate()
//    {
//        return date;
//    }
    
//    public void sortLoc() throws IOException
//    {
//        int j = 0;
//        String loc1 = "";//loc.get(0);
//        String title1 = "";//title.get(0);
//        String date2 = "";//date.get(0);
//        
//        //String tempLoc = "";
//       // String tempTitle = "";
//        //String tempDate = "";
//        if(!loc.isEmpty())
//        {
//            for(int i = 0; i < loc.size(); i++)
//            {
//                j = i;
//                for(int k = i; k < loc.size(); k++)
//                {
//                    if(loc.get(j).charAt(0) > loc.get(k).charAt(0))
//                    {
//                        j = k;
//                    }
//                }
//                loc1 = loc.get(i);
//                title1 = title.get(i);
//                date2 = date.get(i);
//                
//                loc.set(i, loc.get(j));
//                loc.set(j, loc1);
//                
//                title.set(i, title.get(j));
//                title.set(j, title1);
//                
//                date.set(i, date.get(j));
//                date.set(j, date2);
//            }
//        }
//        try{
//            update();
//        }
//        catch(IOException ex)
//        {
//            
//        }
//        
//    }
//    
//    public void sortTitle() throws IOException
//    {
//        int j = 0;
//        String loc1 = "";//loc.get(0);
//        String title1 = "";//title.get(0);
//        String date2 = "";//date.get(0);
//        
//        //String tempLoc = "";
//       // String tempTitle = "";
//        //String tempDate = "";
//        if(!title.isEmpty())
//        {
//            for(int i = 0; i < title.size(); i++)
//            {
//                j = i;
//                for(int k = i; k < title.size(); k++)
//                {
//                    if(title.get(j).charAt(0) > title.get(k).charAt(0))
//                    {
//                        j = k;
//                    }
//                }
//                loc1 = loc.get(i);
//                title1 = title.get(i);
//                date2 = date.get(i);
//                
//                loc.set(i, loc.get(j));
//                loc.set(j, loc1);
//                
//                title.set(i, title.get(j));
//                title.set(j, title1);
//                
//                date.set(i, date.get(j));
//                date.set(j, date2);
//            }
//        }
//        try{
//            update();
//        }
//        catch(IOException ex)
//        {
//            
//        }
//        
//    }

    
}
