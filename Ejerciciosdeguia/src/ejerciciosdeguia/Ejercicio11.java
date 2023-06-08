/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeguia;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase = leer.next();
        
        for (int x=0;x<frase.length();x++)
   System.out.println ("Caracter " + x + ": " + frase.charAt(x));
        
        
        
    }
    
}
