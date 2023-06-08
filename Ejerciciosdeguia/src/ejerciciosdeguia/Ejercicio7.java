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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de motor de la bomba: ");
        
        int num = leer.nextInt();
        
        
      switch (num) {
          case 1:
              System.out.println("La Bomba es una bomba de agua");
              break;
          case 2:
              System.out.println("La bomba es una bomba de gasolina");
              break;
          case 3:
              System.out.println("La bomba es una bomba de Hormigon");
               break;
          case 4:
              System.out.println("La bomba es una bomba de pasta alimenticia");
               break;
          default: System.out.println("No existe un valor valido para el tipo de bomba");
          
      }
      
    }
    
}
