/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeguia;

import java.util.Scanner;

/**
 *
 * @author banhe
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int n = leer.nextInt();
        int vector[] = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) Math.random();
            System.out.print(vector[i]);
        }
        System.out.println("");
    }

}
