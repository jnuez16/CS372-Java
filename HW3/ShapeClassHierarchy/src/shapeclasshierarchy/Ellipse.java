/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeclasshierarchy;

import java.util.InputMismatchException;
import java.lang.Math;

/**
 *
 * @author jnuez16
 */
public class Ellipse extends Shape {

    private int r1;
    private int r2;

    public Ellipse(int r1, int r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public double getArea() {
        return (Math.PI) * (double) r1 * r2;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * ((3 * (r1 + r2)) - Math.sqrt(((3 * r1) + r2) * (r1 + (3 * r2))));
    }
}
