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
public class Triangle extends Shape {

    private int s1;
    private int s2;
    private int s3;

    //javadoc? -3
    public Triangle(int s1, int s2, int s3) {

        if (s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1 || s1 < 0 || s2 < 0 || s3 < 0) {
            throw new IllegalArgumentException("Invalid triangle side lengths.");
        } else {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
    }

    public double getPerimeter() {
        return s1 + s2 + s3;
    }
}
