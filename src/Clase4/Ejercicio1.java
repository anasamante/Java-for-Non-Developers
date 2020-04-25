package Clase4;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*****
        Ejercicio 1
        1.Dado el vector {10,20,5,15,30,20}
        2.Informar el vector de la forma: "Índice: X, Valor: Y"
        3.Totalizar el vector e informar el total
        ***4.Informar el contenido de las posiciones impares (por ejemplo, las posiciones 1,3,5,etc)
        5.Informar el mayor número
        6. Informar cuántas veces aparece el número 20*/

        int[] vector = {10, 20, 5, 15, 30, 20};
        int suma = 0;
        int mayor = 0;
        int cantDeNroVeinte = 0;

        for (int i = 0; i < vector.length; i++) {
            if (i % 2 != 0) {
                System.out.println("El contenido de la posicion impar " + i + ", es: " + vector[i]);
            }
            suma += vector[i];
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
            if (vector[i] == 20) {
                cantDeNroVeinte++;
            }
        }

        System.out.println("El total es " + suma);
        System.out.println("El numero mayor es " + mayor);
        System.out.println("El numero 20 aparece " + cantDeNroVeinte + " veces");

    }
}
