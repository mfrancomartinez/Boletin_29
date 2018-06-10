/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_29;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Cobro {

    public void calcular(ArrayList<Barco> listaBarcos) {

        for (Barco bar : listaBarcos) {
            System.out.println("Cobro total: " + bar.calcularPrecio() + ", Matricula: " + bar.getMat() + ", Días: " + bar.getDias());
        }
    }

    public void calcular(Barco bar) {

        System.out.println("Cobro total: " + bar.calcularPrecio() + ", Matricula: " + bar.getMat() + ", Días: " + bar.getDias());
    }
}
