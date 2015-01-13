/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;

import HomeworkTracker.Stats;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jnuez16
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stats s = new Stats();
        Scanner input = new Scanner(System.in);
        boolean tryagain;

        for (int i = 0; i < 10; i++) {
            do {
                System.out.printf("Integer %d: ", i + 1);
                try {
                    s.addScore(input.nextInt());
                    tryagain = false;
                } catch (InputMismatchException ex) {
                    System.out.println("Invalid Input: Enter an integer!");
                    input.nextLine();
                    tryagain = true;
                }
            }while(tryagain);
            tryagain = false;
        }

        System.out.printf("Max: %d\n", s.maximum());
        System.out.printf("Min: %d\n", s.minimum());
        System.out.printf("Ave: %.2f\n", s.average());
    }

}
