/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String[] dias= {"Lunes","Martes","Miercoles","Jueves","Viernes"};
        double[] ventas = new double[5]; 
        
        for (int i = 0 ; i < dias.length; i++) {
            
            System.out.printf("Ingrese el valor de ventas del %s: $", dias[i]);
            ventas[i] = entrada.nextDouble();
        }
        
        for (int i = 0 ; i < dias.length; i++) {
            System.out.printf("%s $%.0f\n",dias[i],ventas[i]);
            
        }
        
        
      

    }

}
