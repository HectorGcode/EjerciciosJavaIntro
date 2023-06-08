/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.*;

/**
 *
 * @author banhe
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1;
        int num2;
        int opcion;
        char salir;

        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();

        do {

            System.out.println("Menu\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\nElija opción");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma de los numeros es: " + (num1 + num2));
                    break;
                case 2:

                    System.out.println("La resta de los numeros es: " + (num1 - num2));
                    break;
                case 3:

                    System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("no se puede dividir por cero");
                    } else {
                        System.out.println("La División de los numeros es: " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    salir = leer.next().charAt(0);
                    if (salir == 'S' || salir == 's') {
                        System.out.println("hasta luego");
                    }
                    break;
                default:
                    System.out.println("ingrese un numero entre 1 y 5");
            }

        } while (opcion != 5);

    }

}
