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
public class FoodItem {

    private int _weight, _volume;

    public FoodItem(int weight, int volume) {

        _weight = weight;

        _volume = volume;

    }

    public int getWeight() {
        return _weight;
    }

    public int getVolume() {
        return _volume;
    }
    
}
