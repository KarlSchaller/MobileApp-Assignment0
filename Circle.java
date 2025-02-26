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
public class Circle extends Shape {
    
    private double radius;
    
    public Circle(String name) {
        super(name);
    }
    
    public void setDimensions(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void printDimensions(){
        System.out.println("Radius: " + radius);
    }
    
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    
}
