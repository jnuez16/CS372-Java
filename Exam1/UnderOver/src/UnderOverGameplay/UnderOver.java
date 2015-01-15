/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UnderOverGameplay;
import java.util.*;

/**
 *
 * @author jnuez16
 */
public class UnderOver {
    private int[] dice = new int[2];
    private int bet = 0;
    Random r = new Random(100);
    /**
     * Rolls the dice
     * @return an array of int holding the dice value
     */
    public int[] roll()
    {
        for(int i = 0; i < dice.length; i++)
        {
            dice[i] = (int)(r.nextInt(Integer.MAX_VALUE)%6 +1);
        }
        return dice;
    }
    
    /**
     * outputs the money earned
     * @param bet
     * @param choice
     * @param money
     * @return 
     */
    public int Win(int bet,int choice,int money)
    {
        int result;
        if(choice == 0)
        {
            result = money + bet;
        }
        else
        {
            result = money + 4*bet;
        }
        return result;
    }
    /**
     * outputs the money lost
     * @param bet amount they bet
     * @param choice 
     * @param money current money they have
     * @return the money lost
     */
    public int Lose(int bet, int choice, int money)
    {
        int result;
        if(choice == 0)
        {
            result = money - bet;
        }
        else
        {
            result = money - 4*bet;
        }
        return result;
    }
    /**
     * mutator function for bet
     * @param i the bet
     */
    public void setBet(int i)
    {
        bet = i;
    }
    /**
     * accessor function for bet
     * @return the bet value
     */
    public int getBet()
    {
        return bet;
    }
}
