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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String Frase = leer.nextLine();
        String eureka = "eureka";

        if (Frase.equals(eureka)) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
    }

}


