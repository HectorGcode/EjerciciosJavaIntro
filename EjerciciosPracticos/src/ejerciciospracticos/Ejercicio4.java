/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int grados;
        double Fahrenheit;
        System.out.println("Ingrese los grados centigrados:");
        grados = leer.nextInt();
        Fahrenheit = (grados*9/5)+32;
        System.out.println("los "+grados+"° centigrados en Fahrenheit son "+Fahrenheit);
    }

}
