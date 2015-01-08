/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodbank.main;

import java.util.*;
import foodbank.food.*;

/**
 *
 * @author jnuez16
 */
public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();

        ArrayList<FoodContainer> fc = new ArrayList<FoodContainer>();
        fc.add(new FoodContainer());

        int c = rnd.nextInt(50) + 20;

        for (int i = 0; i < c; i++) {
            int x = rnd.nextInt(7) + 1;

            switch (x) {
                case 1:
                    if (fc.get(fc.size() - 1).addItem(new Soup(rnd.nextInt(30) + 10, rnd.nextInt(50) + 10))) 
                    {
                        fc.add(new FoodContainer());
                    }

                    break;
                case 2:
                    if(fc.get(fc.size() - 1).addItem(new Coffee(rnd.nextInt(50) + 10, rnd.nextInt(150) + 10)))
                    {
                        fc.add(new FoodContainer());
                    }
                    break;
                case 3:
                    if(fc.get(fc.size() - 1).addItem(new Tea(rnd.nextInt(50) + 10, rnd.nextInt(150) + 10)))
                    {
                        fc.add(new FoodContainer());
                    }
                    break;
                case 4:
                    if(fc.get(fc.size() - 1).addItem(new Bread(rnd.nextInt(50) + 10, rnd.nextInt(150) + 10)))
                    {
                        fc.add(new FoodContainer());
                    }
                    break;
                case 5:
                    if(fc.get(fc.size() - 1).addItem(new Pasta(rnd.nextInt(50) + 10, rnd.nextInt(150) + 10)))
                    {
                        fc.add(new FoodContainer());
                    }
                    break;
                case 6:
                    if(fc.get(fc.size() - 1).addItem(new Pastry(rnd.nextInt(50) + 10, rnd.nextInt(150) + 10)))
                    {
                        fc.add(new FoodContainer());
                    }
                    break;
                case 7:
                    if(fc.get(fc.size() - 1).addItem(new Wine(rnd.nextInt(50) + 10, rnd.nextInt(150) + 10)))
                    {
                        fc.add(new FoodContainer());
                    }
                    break;
                default:
                    System.out.println("Invalid Random Number!");
            }

        }
        for (int i = 0; i < fc.size(); i++)
        {
        System.out.printf("Total number of items: %d\n", fc.get(i).getCount());

        System.out.printf("\tTotal weight: %d\n", fc.get(i).getWeight());

        System.out.printf("\tTotal volume: %d\n", fc.get(i).getVolume());
        }
        
        System.out.println(fc.size());
        

        //System.out.println("What would you like to get: ");
        //System.out.println("\t");
    }

}
