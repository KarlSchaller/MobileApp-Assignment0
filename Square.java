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
public class Square extends Shape {
    
    private double length, height;
    
    public Square(String name) {
        super(name);
    }
    
    public void setDimensions(double length, double height) {
        this.length = length;
        this.height = height;
    }
    
    @Override
    public void printDimensions(){
        System.out.println("Length: " + length);
        System.out.println("Height: " + height);
    }
    
    @Override
    public double getArea() {
        return length*height;
    }
}
