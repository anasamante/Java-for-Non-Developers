package Clase4;/*
Ejercicio 6
        Copiar el contenido del vector origen al vector destino, dejando en este último
        los valores invertidos respecto del vector origen.Utilizar estructura de control de flujo repetitiva,
        y luego informar el índice y los valores del nuevo vector.
*/

public class Ejercicio6 {
    public static void main(String[] args) {
        int[] origen = {23, 45, 67, 56, 423};
        int[] copia = new int[origen.length];

        for (int i = 0; i<copia.length ; i++) {
            copia[i] = origen[origen.length-i-1];
            System.out.println("Indice: " + i + ". Valor: " + copia[i]);
        }
    }
}
