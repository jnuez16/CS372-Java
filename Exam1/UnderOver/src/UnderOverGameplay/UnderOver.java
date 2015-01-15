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
    
    public int[] roll()
    {
        for(int i = 0; i < dice.length; i++)
        {
            dice[i] = (int)(r.nextInt(Integer.MAX_VALUE)%6 +1);
        }
        return dice;
    }
    
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
    
    public void setBet(int i)
    {
        bet = i;
    }
    public int getBet()
    {
        return bet;
    }
}
