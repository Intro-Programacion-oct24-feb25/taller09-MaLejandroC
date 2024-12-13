/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite;
        int i = 0;
        String cadena = "";
        System.out.println("Ingrese un numero de elementos a almacenar: ");
        limite = entrada.nextInt();
        
        entrada.nextLine();
        
        String[] nombresM = new String[limite];

        while (i < nombresM.length)   {
            System.out.println("Ingrese el nombre de la marca: ");
            String nombre = entrada.nextLine();
            
            String inicial = nombre.substring(0 , 1); 
            
            inicial = inicial.toUpperCase();
            
            if (!inicial.equals("A") && !inicial.equals("C") && 
                    !inicial.equals("T")) {
                nombresM[i] = nombre;
                
                cadena = String.format("%sla marca de vehiculo: %s\n",
                        cadena,
                        nombresM[i]);
                
                i = i + 1;
            }
               
        }
        
        System.out.printf("Las marcas de los vehiculos son: \n%s", cadena);

    }

}
