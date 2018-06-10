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
public class Yate extends Barco {

    double cv;
    int numcam;

    @Override
    public double calcularPrecio() {
        return (super.calcularModulo()+(3*cv)+(4*numcam))*super.getDias();
    }

    public Yate(double cv, int numcam, String mat, double eslora, int dias) {
        super(mat, eslora, dias);
        this.cv = cv;
        this.numcam = numcam;
    }

    @Override
    public String toString() {
        return "Yate{ " + " cv: " + cv + ", numcam: " + numcam + " }";
    }
}
