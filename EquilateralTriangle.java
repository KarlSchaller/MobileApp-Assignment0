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
public class EquilateralTriangle extends Triangle {
    
    public EquilateralTriangle(String name) {
        super(name);
    }
    
    public void setDimensions(double length) {
        super.setDimensions(length, length, length);
    }
    
    @Override
    public void setDimensions(double a, double b, double c) {
        super.setDimensions(a, a, a);
    }
}
