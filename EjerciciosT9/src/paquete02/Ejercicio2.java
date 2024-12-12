/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite;
        
        String cadena = "";
        int fuera_de_rango = 0;
        //String fuera_de_rango = "fuera-de-rango";
        System.out.println("Ingrese un numero de elementos a almacenar: ");
        limite = entrada.nextInt();
        
        entrada.nextLine();
        
        String[] nombresM = new String[limite];

        for (int i = 0; i < nombresM.length; i++) {
            System.out.println("Ingrese el nombre de la marca: ");
            String nombre = entrada.nextLine();
            
            String inicial = nombre.substring(0 , 1); 
            
            inicial = inicial.toUpperCase();
            
            if (!inicial.equals("A") && !inicial.equals("C") && !inicial.equals("T")) {
                nombresM[i] = nombre;
                
                cadena = String.format("%sla marca de vehiculo: %s\n",
                        cadena,
                        nombresM[i]);
                
               
            } else {
                fuera_de_rango = fuera_de_rango + 1;
            }
               
        }
        
        System.out.printf("Las marcas de los vehiculos son: \n%s\n"
                + "Fuera-de-rango: %d\n",
                cadena, 
                fuera_de_rango);

    }

}
