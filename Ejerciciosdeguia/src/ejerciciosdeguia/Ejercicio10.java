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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1,num2,num3,num4;
       
       Scanner leer = new Scanner(System.in);
     
        do {
               System.out.println("ingrese el primer numero entre uno y 20");
       num1 = leer.nextInt();
        } while (num1>20 || num1<1);
        do {
               System.out.println("ingrese el segundo numero entre uno y 20");
       num2 = leer.nextInt();
          } while (num2>20 || num2<1);
      do {
               System.out.println("ingrese el tercer numero entre uno y 20");
       num3 = leer.nextInt();
          } while (num3>20 || num3<1);
      do {
               System.out.println("ingrese el cuarto numero entre uno y 20");
       num4 = leer.nextInt();
          } while (num4>20 || num4<1);
        
        System.out.print(num1+" ");
        for (int i = 0; i < num1; i++) {
        System.out.print("*");  
        }
        
        System.out.println("");
        System.out.print(num2+" ");
         for (int i = 0; i < num2; i++) {
        System.out.print("*");  
        }
         System.out.println("");
         System.out.print(num3+" ");
          for (int i = 0; i < num3; i++) {
        System.out.print("*");  
        }
        System.out.println("");
        System.out.print(num4+" ");
           for (int i = 0; i < num4; i++) {
        System.out.print("*");  
        }
    }
    
}
