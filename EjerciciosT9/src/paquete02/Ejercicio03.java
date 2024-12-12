/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int suma = 0;
        double promedio;
        int arriba = 0;
        int debajo = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];

        }

        promedio = (double) suma / arreglo.length;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < promedio) {
                arriba = arriba + 1;
            } else {
                debajo = debajo + 1;
            }
        }
        
        System.out.printf("Media aritmetica: %.2f\narriba de la media "
                + "aritmética: %d\ndebajo de la medía aritmética: %d\n", 
                promedio, 
                arriba, 
                debajo);
    }

}
