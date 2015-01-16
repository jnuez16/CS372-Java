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
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jnuez_000
 */
public class CalendarInformation {
    private Vector<String> title = new Vector<String>();
    private Vector<String> loc = new Vector<String>();
    private Vector<String> date = new Vector<String>();
    private File f = new File("C:\\Users\\jnuez_000\\Documents\\GitHub\\CS372-Java\\HW3\\EventCalendar\\Calendar.txt");
    
    public CalendarInformation() throws FileNotFoundException, IOException
    {
        try{
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String line;
            while((line = rdr.readLine()) != null)
            {
                Pattern p = Pattern.compile("title: (.*);");
                Matcher m = p.matcher(line);
                while(m.find())
                {
                    title.add(m.group(1));
                }
                
                p = Pattern.compile("location: (.*);");
                m = p.matcher(line);
                while(m.find())
                {
                    loc.add(m.group(1));
                }
                
                p = Pattern.compile("Date: (.*);");
                m = p.matcher(line);
                while(m.find())
                {
                    date.add(m.group(1));
                }
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
    
    public void update() throws FileNotFoundException, IOException
    {
        try{
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f));
            for(int i = 0; i < title.size(); i++)
            {
                wrtr.write(String.format("title: %s;\nlocation: %s;\nDate: %s;\n", title.get(i), loc.get(i), date.get(i)));
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
    
    public void addInfo(String title, String loc, String Date)
    {
        this.title.add(title);
        this.loc.add(loc);
        this.date.add(Date);
    }
    
    public Vector<String> getTitle()
    {
        return title;
    }
    
    public Vector<String> getLoc()
    {
        return loc;
    }
    
    public Vector<String> getDate()
    {
        return date;
    }
    
    public void sortLoc() throws IOException
    {
        int j = 0;
        String loc1 = "";//loc.get(0);
        String title1 = "";//title.get(0);
        String date2 = "";//date.get(0);
        
        //String tempLoc = "";
       // String tempTitle = "";
        //String tempDate = "";
        if(!loc.isEmpty())
        {
            for(int i = 0; i < loc.size(); i++)
            {
                j = i;
                for(int k = i; k < loc.size(); k++)
                {
                    if(loc.get(j).charAt(0) > loc.get(k).charAt(0))
                    {
                        j = k;
                    }
                }
                loc1 = loc.get(i);
                title1 = title.get(i);
                date2 = date.get(i);
                
                loc.set(i, loc.get(j));
                loc.set(j, loc1);
                
                title.set(i, title.get(j));
                title.set(j, title1);
                
                date.set(i, date.get(j));
                date.set(j, date2);
            }
        }
        try{
            update();
        }
        catch(IOException ex)
        {
            
        }
        
    }
    
    public void sortTitle() throws IOException
    {
        int j = 0;
        String loc1 = "";//loc.get(0);
        String title1 = "";//title.get(0);
        String date2 = "";//date.get(0);
        
        //String tempLoc = "";
       // String tempTitle = "";
        //String tempDate = "";
        if(!title.isEmpty())
        {
            for(int i = 0; i < title.size(); i++)
            {
                j = i;
                for(int k = i; k < title.size(); k++)
                {
                    if(title.get(j).charAt(0) > title.get(k).charAt(0))
                    {
                        j = k;
                    }
                }
                loc1 = loc.get(i);
                title1 = title.get(i);
                date2 = date.get(i);
                
                loc.set(i, loc.get(j));
                loc.set(j, loc1);
                
                title.set(i, title.get(j));
                title.set(j, title1);
                
                date.set(i, date.get(j));
                date.set(j, date2);
            }
        }
        try{
            update();
        }
        catch(IOException ex)
        {
            
        }
        
    }
}
