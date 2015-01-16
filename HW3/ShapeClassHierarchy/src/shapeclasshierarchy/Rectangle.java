/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeclasshierarchy;

/**
 *
 * @author jnuez16
 */
public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Cannot initialize with negative width and height.");
        } else {
            this.width = width;
            this.height = height;
        }

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
