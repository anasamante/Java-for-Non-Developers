package Clase4;/*Ejercicio 5
  Copiar el contenido del vector origen al vector destino utilizando estructura de control de flujo repetitiva,
  y luego informar el índice y los valores del nuevo vector*/

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
         int[] origen = {23, 45, 67, 56, 423};
         int[] copia = new int[origen.length];

         for (int i= 0; i< origen.length; i++){
             copia[i] = origen[i];
             System.out.println("Indice: " + i + ". Valor: " +copia[i]);
         }
    }
}
