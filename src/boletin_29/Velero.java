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
public class Velero extends Barco {

    int mast;

    @Override
    public double calcularPrecio() {

        return (super.calcularModulo()+(2*mast))*super.getDias();
    }

    public Velero(int mast, String mat, double eslora, int dias) {
        super(mat, eslora, dias);
        this.mast = mast;
    }

    @Override
    public String toString() {
        return "Velero{ " + "mast: " + mast + " }";
    }
}
