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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int suma = 0;
        int contador =0;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (num > 0){
                suma +=num;
            }
            contador ++;
            if (contador==20){
                break;
            }
            if (num==0){
             System.out.println("Se capturó el numero 0");     
            }
        } while (num != 0);
        System.out.println("la suma de los numeros es: " + suma);
    }
    
}
