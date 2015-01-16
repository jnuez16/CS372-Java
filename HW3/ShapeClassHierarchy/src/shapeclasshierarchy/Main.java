/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeclasshierarchy;

import java.util.InputMismatchException;

/**
 *
 * @author jnuez16
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rec = null;
        Ellipse elip = null;
        Triangle tri = null;
        try {
            rec = new Rectangle(6, 10);
            elip = new Ellipse(13, 2);
            tri = new Triangle(3, 4, 12);

        } catch (InputMismatchException ex) {
            System.out.println("Invalid Input: Enter an Integer!");
        } catch (IllegalArgumentException ex) {
            System.out.printf("Error: %s\n", ex.getMessage());
        }
        if (rec != null) {
            System.out.printf("Rectangle \n\tArea: %.2f\n\tPerimeter: %.2f\n", rec.getArea(), rec.getPerimeter());
        }
        if (elip !=null) {
            System.out.printf("Ellipse\n\tArea: %.2f\n\tPerimeter: %.2f\n", elip.getArea(), elip.getPerimeter());
        }
        if (tri != null) {
            System.out.printf("Triangle\n\tArea: %.2f\n\tPerimeter: %.2f\n", tri.getArea(), tri.getPerimeter());
        }
    }
}
