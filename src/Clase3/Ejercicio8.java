package Clase3;

public class Ejercicio8 {
    public static void main(String[] args) {
        //Imprimir la multiplicación de los números impares que se encuentran entre -10 y 10
    int num = -10;
    int multiplicacion = 1;

        while (num <= 10){
            if(num % 2 != 0){
                multiplicacion = multiplicacion * num;
            }
            num++;
        }
        System.out.println("la multiplicación de los números impares que se encuentran entre -10 y 10 es " + multiplicacion);
    }
}
