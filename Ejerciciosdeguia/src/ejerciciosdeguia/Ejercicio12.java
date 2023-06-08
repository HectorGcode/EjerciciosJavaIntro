/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeguia;

import java.util.Scanner;

/**
 *
 * @author banhe
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int correctas=0;
        int incorrectas=0;
        int tamaniocadena=0;
        String cadena;
        String FDE = "&&&&&";
        
     
        
        do {
                System.out.println("Ingrese una cadena");
            cadena = leer.nextLine();
            tamaniocadena = cadena.length();
            if (tamaniocadena == 5 && cadena.substring(0,1).equals("x") && cadena.substring(4,5).equals("o")) {
                correctas += 1;
            }else{
                incorrectas += 1;
           
            }
         } while (!cadena.equals(FDE));
        
        System.out.println("cadenas correctas" + correctas);
        System.out.println("cadenas incorrectas"+ (incorrectas-1));
    }

}
