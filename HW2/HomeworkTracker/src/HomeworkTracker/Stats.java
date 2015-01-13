/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeworkTracker;

import java.util.*;

/**
 *
 * @author jnuez16
 */
public class Stats {

    List<Integer> stats = new ArrayList<Integer>();

    /**
     * <p> Adds a new score to the list of scores </p>
     * @param d Score
     */
    public void addScore(Integer d) {
        stats.add(d);
    }

    /**
     * <p> Searches for the minimum score from the list </p>
     * @return Returns the minimum score as a double
     */
    public Integer minimum() {
        int min = 0;
        if (stats.size() > 0) {
            min = stats.get(0);
            for (int i = 0; i < stats.size(); i++) {
                if (stats.get(i) < min) {
                    min = stats.get(i);
                }
            }
        }
        return min;
    }

    /**
     * <p> Searches for the maximum score from the list </p>
     * @return Returns the minimum score as a double
     */
    public Integer maximum() {
        int max = 0;
        if(stats.size() > 0)
        {
            max = stats.get(0);
            for(int i = 0; i < stats.size(); i++)
            {
                if(stats.get(i) > max)
                {
                    max = stats.get(i);
                }
            }
        }
        return max;
    }
    
    /**
     * <p> Finds the average of the inputed scores </p>
     * @return Returns the average as a double
     */
    public Double average()
    {
        double average = 0;
        if(stats.size() > 0)
        {
            for(int i = 0; i < stats.size(); i++)
            {
                average += (double)stats.get(i);
            }
        }
        return average/stats.size();
    }
    
    /**
     * <p> Finds the sum of the scores </p>
     * @return Returns the sum as a double
     */
    public Integer total()
    {
        int sum = 0;
        if(stats.size() > 0)
        {
            for(int i = 0; i < stats.size(); i++)
            {
                sum += stats.get(i);
            }
        }
        return sum;
    }
}
