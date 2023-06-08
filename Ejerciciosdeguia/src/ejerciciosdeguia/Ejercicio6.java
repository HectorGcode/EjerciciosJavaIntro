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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int num1;
       int num2;
   
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese el primer numero");     
       num1 = leer.nextInt();
       System.out.println("Ingrese el segundo numero");
       num2 = leer.nextInt();
       
          
       if (num1>25) {
            System.out.println("El primer numero ingresado es mayor a 25");
        }else{
            System.out.println("el primer numero ingresado es menor o igual a 25");
            {
        if (num2>25) {
            System.out.println("El segundo numero ingresado es mayor a 25");
        }else{
            System.out.println("el segundo numero ingresado es menor o igual a 25");  
             }
    
            }
       }
    }
}


