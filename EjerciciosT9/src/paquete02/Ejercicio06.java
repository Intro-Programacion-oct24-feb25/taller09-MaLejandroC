/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String[] arreglo = {"Café tradicional", "Café francés", "Café alemán"};
        double[] precios = {1.5, 2.1, 2.3};
        int i;
        double total = 0;
        String cadena = "";
        String continuar;
        do {
            System.out.println("Menú:");
            for (int j = 0; j < arreglo.length; j++) {
                System.out.printf("%d - %s <-- $%.2f\n", j, arreglo[j], 
                        precios[j]);
            }
            System.out.println("Que desea comprar (Ingrese el número): ");
            i = entrada.nextInt();
                        
            System.out.printf("Ingrese el numero de tazas a consumir de %s: ", 
                    arreglo[i]);
            int cantidad = entrada.nextInt();
            
            double valor = precios[i] * cantidad;
            
            total = total + valor;
            
            cadena = String.format("%s%s(%dt),valor a cancelar $%.1f\n",
                    cadena,
                    arreglo[i],
                    cantidad,
                    valor);
            
            entrada.nextLine();

            System.out.print("Ingrese \"c\" si desea continuar ingresando "
                    + "productos: ");
            continuar = entrada.nextLine();
            
            
        } while (continuar.equals("c"));
        
        System.out.printf("%sTotal a pagar: $%.1f\n",cadena,total);
    }
}
