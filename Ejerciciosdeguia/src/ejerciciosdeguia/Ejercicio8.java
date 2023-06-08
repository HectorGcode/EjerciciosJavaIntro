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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1;
       
       Scanner leer = new Scanner(System.in);
     
        do {
               System.out.println("ingrese una nota entre 0 y 10");
       num1 = leer.nextInt();
        } while (num1>10 || num1<0);
        System.out.println("La nota que ha ingresado es "+ num1);
    }
    
}
