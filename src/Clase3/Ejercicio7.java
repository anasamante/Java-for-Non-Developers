package Clase3;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
        Ejercicio 7
        Imprimir la suma de los números pares del 1 al 25
        Requisito: se necesita tener conocimientos del operador RESTO (%)
         */
        int num =1;
        int suma = 0;


        while (num <= 25){
            if(num % 2 == 0){
                suma = suma + num;
            }
            num++;
        }
        System.out.println("La suma de los números pares del 1 al 25 es " + suma);
    }
}
