/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schaller_assignment0;

/**
 *
 * @author Karl
 */
public class Triangle extends Shape {
    
    private double a, b, c;
    
    public Triangle(String name) {
        super(name);
    }
    
    public void setDimensions(double side1, double side2, double side3) {
        this.a = side1;
        this.b = side2;
        this.c = side3;
    }
    
    @Override
    public void printDimensions(){
        System.out.println("Side 1: " + a);
        System.out.println("Side 2: " + b);
        System.out.println("Side 3: " + c);
    }
    
    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
