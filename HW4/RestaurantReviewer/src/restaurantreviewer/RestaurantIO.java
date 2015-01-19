/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantreviewer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import restaurantreviewer.Restaurant;

/**
 *
 * @author jnuez_000
 */
public class RestaurantIO {

    private List<Restaurant> rest = new ArrayList<Restaurant>();
    private File f = new File("Restaurant.txt");

    public RestaurantIO() throws FileNotFoundException, IOException {
        String name = "";
        String addr = "";
        String note = "";
        int rate = 0;

        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String line;
            while ((line = rdr.readLine()) != null) {
                Pattern p = Pattern.compile("<name>Name: (.*)</name>");
                Matcher m = p.matcher(line);
                while (m.find()) {
                    name = m.group(1);
                }

                p = Pattern.compile("<addr>Address: (.*)</addr>");
                m = p.matcher(line);
                while (m.find()) {
                    addr = m.group(1);
                }

                p = Pattern.compile("<note>Notes: (.*)</note>");
                m = p.matcher(line);
                while (m.find()) {
                    note = m.group(1);
                }

                p = Pattern.compile("<rate>Rate: (.*)</rate>");
                m = p.matcher(line);
                while (m.find()) {
                    rate = Integer.parseInt(m.group(1));
                }

                rest.add(new Restaurant(name, addr, note, rate));
            }
            rdr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        } catch (IOException ex) {
            System.out.println("I/O error!");
        }
    }

    public void update() throws IOException {
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f));
            for (int i = 0; i < rest.size(); i++) {
                wrtr.write(String.format("<name>Name: %s</name> <addr>Address: %s</addr> <note>Notes: %s</note> "
                        + "<rate>Rate: %d</rate>\n", rest.get(i).getName(), rest.get(i).getAddress(), rest.get(i).getNotes(), rest.get(i).getRate()));
            }
            rdr.close();
            wrtr.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        } catch (IOException ex) {
            System.out.println("I/O error!");
        }
    }
    
    public List<Restaurant> getRestaurant()
    {
        return rest;
    }
    
    public void addInfo(String name, String addr, String note, int rate)
    {
        rest.add(new Restaurant(name, addr, note, rate));
    }

}
