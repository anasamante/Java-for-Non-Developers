package Clase3;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*Imprimir la suma de los números del 1 al 10*/

        int num = 1;
        int suma = 0;

        while (num <=10){
            suma = suma + num;
            num++;
        }

        System.out.println("la suma de los números del 1 al 10: " + suma);
    }
}
