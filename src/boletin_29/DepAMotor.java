/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_29;

/**
 *
 * @author Marcos
 */
public class DepAMotor extends Barco{
    
    double cv;

    @Override
    public double calcularPrecio() {
        return (super.calcularModulo()+(3*cv))*super.getDias();
    }

    public DepAMotor(double cv, String mat, double eslora, int dias) {
        super(mat, eslora, dias);
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "DepAMotor{ " + "cv:" + cv + " }";
    }
}  

