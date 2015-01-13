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
public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

    }

    @Override
    public double getArea() {
        return (double) width * height;
    }

    @Override
    public double getPerimeter() {
        return (2 * (double) width) + (2 * height);
    }
}
