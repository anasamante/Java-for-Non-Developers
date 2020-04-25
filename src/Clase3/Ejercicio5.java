package Clase3;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
        Imprimir los números del 1 al 30 sin imprimir números entre el 10 y el 20 uno abajo del otro

        Requisito: se necesita tener conocimientos del operador OR (||)

         */

        int num = 1;
        while(num <= 30){
            if ((num <= 10) || (num >= 20)) {
                System.out.println(num);
            }
            num++;
        }
    }
}
