/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeguia;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Ejercicio13y14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String Equipo[] =  new String[6];
        
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese el nombre"); 
            Equipo[i]=leer.nextLine();
        }
//        for (int i = 0; i < 6; i++) {
//            System.out.println(Equipo[i]); 
//        }
        System.out.println(Arrays.toString(Equipo));

        
    }
    
}
