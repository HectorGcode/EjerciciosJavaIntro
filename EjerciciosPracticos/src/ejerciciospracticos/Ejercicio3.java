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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("ingrese una frase en minuscula");
        frase = leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println("ingrese una frase en mayuscula");
        frase = leer.nextLine();
        System.out.println(frase.toLowerCase());
        
    }
    
}
