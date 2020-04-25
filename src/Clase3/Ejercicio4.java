package Clase3;

public class Ejercicio4 {
    public static void main(String[] args) {

        /*
        Imprimir los números del 1 al 10 sin imprimir números 2,5 y 9 uno abajo del otro

        Requisito: se necesita tener conocimiento del operador AND (&&) y del operador NOT (!=)
        */

        byte num =1;

        while (num <= 10) {
            if((num != 2 ) && (num != 5) && (num!= 9))
            System.out.println(num);
            num++;
        }
    }
}
