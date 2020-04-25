package Clase3;

public class Ejercicio5For {
    public static void main(String[] args) {
//        Ejercicio 5
//Mostrar la resta de la multiplicación de los números del 1 al 5 con la suma de los números del 1 al 5.
// Por ejemplo, seria (1*2*3*4*5) - (1+2+3+4+5)

        int multiplicacion =1;
        int suma = 0;
        int num;

        for(num=1; num<=5; num++){
            multiplicacion *=  num;
            suma +=  num;
        }
        int resta = multiplicacion - suma;
        System.out.println("la resta de la multiplicación de los números del 1 al 5 con la suma de los números del 1 al 5 es " +
                resta);
    }
}
