/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodbank.food;

/**
 *
 * @author jnuez16
 */
public class Coffee extends FoodItem {

    public Coffee(int weight, int volume) {

        super(weight, volume);

    }

    public void Grind() {

        System.out.println("grinding ...");

    }
    public String toString()
    {
        return "Hi this is Coffee!\n";
    }

}
