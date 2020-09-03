/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schaller_assignment0;
import java.util.Scanner;

/**
 *
 * @author Karl
 */
public class Schaller_assignment0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Square square1 = new Square("Square 1");
        Circle circle1 = new Circle("Circle 1");
        Triangle triangle1 = new Triangle("Triangle 1");
        EquilateralTriangle equilateral1 = new EquilateralTriangle("Equilateral 1");
        
        
        
        // ====================== CREATING OBJECTS ======================
        System.out.print("Enter length of Square 1: ");
        double length = input.nextDouble();
        System.out.print("Enter height of Square 1: ");
        double height = input.nextDouble();
        square1.setDimensions(length, height);
        
        System.out.print("Enter radius of Circle 1: ");
        double radius = input.nextDouble();
        circle1.setDimensions(radius);
        
        System.out.print("Enter side 1 of Triangle 1: ");
        double a = input.nextDouble();
        System.out.print("Enter side 2 of Triangle 1: ");
        double b = input.nextDouble();
        System.out.print("Enter side 3 of Triangle 1: ");
        double c = input.nextDouble();
        triangle1.setDimensions(a, b, c);
        
        System.out.print("Enter length of Equilateral 1: ");
        double s = input.nextDouble();
        equilateral1.setDimensions(s);
        
        
        
        // ====================== PRINTING OBJECTS ======================
        System.out.println("=============");
        System.out.println("Square: " + square1.getName());
        square1.printDimensions();
        System.out.println("Area: " + square1.getArea());
        System.out.println("=============");
        
        System.out.println("=============");
        System.out.println("Circle: " + circle1.getName());
        circle1.printDimensions();
        System.out.println("Area: " + circle1.getArea());
        System.out.println("=============");
        
        System.out.println("=============");
        System.out.println("Triangle: " + triangle1.getName());
        triangle1.printDimensions();
        System.out.println("Area: " + triangle1.getArea());
        System.out.println("=============");
        
        System.out.println("=============");
        System.out.println("Equilateral: " + equilateral1.getName());
        equilateral1.printDimensions();
        System.out.println("Area: " + equilateral1.getArea());
        System.out.println("=============");
    }
    
}
