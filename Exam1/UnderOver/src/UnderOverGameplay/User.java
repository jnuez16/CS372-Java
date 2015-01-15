/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnderOverGameplay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jnuez16
 */
public class User {

    private List<String> username = new ArrayList<String>();
    private Vector<Integer> money = new Vector<Integer>();
    File f = new File("C:\\Users\\jnuez_000\\Documents\\GitHub\\CS372-Java\\Exam1\\UnderOver\\User.txt");

    /**
     * Constructor that reads in the file and stores info
     *
     * @throws IOException
     */
    public User() throws IOException {
        try (BufferedReader rdr = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = rdr.readLine()) != null) {
                Pattern p = Pattern.compile("username: (.*);");
                Matcher m = p.matcher(line);
                while (m.find()) {
                    username.add(m.group(1));
                }

                Pattern p1 = Pattern.compile("money: (.*);");
                Matcher m1 = p1.matcher(line);
                while (m1.find()) {
                    money.add(Integer.parseInt(m1.group(1)));
                }
            }
            rdr.close();
        } catch (IOException ex) {
            System.out.println("Input Error!");
        }
    }

    /**
     * Updates the file if there's a new user
     *
     * @param username
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void update(String username) throws FileNotFoundException, IOException {
        int m = 500;
        this.username.add(username);
        this.money.add(m);
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f));
            for (int i = 0; i < this.username.size(); i++) {
                wrtr.write(String.format("username: %s; \nmoney: %d;\n", this.username.get(i), this.money.get(i)));
            }
            rdr.close();
            wrtr.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File Cannot Open!");
        } catch (IOException ex) {
            System.out.println("Input Error!");

        }
    }

    /**
     * updatea data on the file after rolling.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void fileUpdate() throws FileNotFoundException, IOException {
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f));
            for (int i = 0; i < this.username.size(); i++) {
                wrtr.write(String.format("username: %s; \nmoney: %d;\n", this.username.get(i), this.money.get(i)));
            }
            rdr.close();
            wrtr.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File Cannot Open!");
        } catch (IOException ex) {
            System.out.println("Input Error!");

        }
    }

    /**
     * updates the money of the user
     *
     * @param i
     * @param m
     */
    public void changeMoney(int i, int m) {
        money.set(i, m);
    }

    /**
     * accessor function for username
     *
     * @return A list of strings holding the username
     */
    public List<String> getUsername() {
        return username;
    }

    /**
     * accessor function for money
     *
     * @return A vector of integers holding the money
     */
    public Vector<Integer> getMoney() {
        return money;
    }
}
