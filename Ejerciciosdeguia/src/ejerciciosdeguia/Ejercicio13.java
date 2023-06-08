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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los lados del cuadrado");
        int lados = leer.nextInt();

        for (int i = 0; i < lados; i++) {
            for (int j = 0; j < lados; j++) {
                if (j == 0 || j == lados - 1 || i == 0 || i == lados - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

}
