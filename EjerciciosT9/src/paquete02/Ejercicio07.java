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
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        
        int[] numeros = new int [10];
        int suma = 0; 
        
        for (int i= 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = entrada.nextInt();
            
            suma = suma + numeros[i];
                   
            
        }
        
        double promedio = (double)suma / numeros.length;
        
        for (int i= 0; i < numeros.length; i++) {
            double diferencia = promedio-numeros[i];
            System.out.printf("%.2f - %d --> %.2f\n",
                    promedio,
                    numeros[i],
                    diferencia);
        }

    }

}
