/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class Ejercicio15Laura {

    public static void main(String[] args) {
        int vector[] = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
        }
        System.out.println(Arrays.toString(vector));

        System.out.print("{");
        for (int i = 99; i >= 0; i--) {
            System.out.print(vector[i] + ", ");
        }
        System.out.println("}");
    }
}
