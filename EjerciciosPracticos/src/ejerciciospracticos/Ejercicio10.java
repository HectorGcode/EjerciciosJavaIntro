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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el limite");
        int limite = leer.nextInt();
        int suma;
        int num;
//        for (int i = 0; i < limite; i++) {
//            System.out.println("ingrese el numero a sumar");
//            suma = leer.nextInt();
//            suma += suma;
//        }
            suma=0;
        do {
            System.out.println("ingrese el numero a sumar");
            num = leer.nextInt();
            suma += num;
        } while (limite>=suma);
        
        
        System.out.println("La suma de los numeros ingresados es "+suma);
    }

}
