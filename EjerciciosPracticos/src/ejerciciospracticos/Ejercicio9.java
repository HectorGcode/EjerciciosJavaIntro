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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String Frase = leer.nextLine();
        String a = Frase.substring(0,1);
        
        if ("A".equals(a)) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
    }
}
