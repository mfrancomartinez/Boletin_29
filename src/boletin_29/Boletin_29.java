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
public class Boletin_29 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Barco> listaBarcos = new ArrayList();     

    public static void main(String[] args) {

        Barco barco = new Velero(3, "2557A", 10, 7);
        listaBarcos.add(barco);        

        Cobro cob = new Cobro();

        cob.calcular(listaBarcos);
    }
    }
    

