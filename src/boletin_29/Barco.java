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
public abstract class Barco {

    String mat;
    double eslora;
    int dias;

    public abstract double calcularPrecio();

    public double calcularModulo() {
        return eslora * 10;
    }

    public Barco(String mat, double eslora, int dias) {
        this.mat = mat;
        this.eslora = eslora;
        this.dias = dias;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Barco{ " + "mat: " + mat + ", eslora: " + eslora + ", dias: " + dias + " }";
    }
}