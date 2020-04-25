package Clase2;

public class Ejercicio5 {
    /*
Dado el siguiente código:
int nro1 = 100, nro2 = 500, nro3 = 250;
Informar cual de los tres números es mayor
     */

    public static void main(String[] args) {
        int nro1 = 10, nro2 = 5, nro3 = 250;

        if(nro1 > nro2 && nro1>nro3){
            System.out.println( nro1 + " es mayor a " + nro2 + " y a " + nro3 );
        }
        else if (nro2 > nro1 && nro2 > nro3){
            System.out.println( nro2 + " es mayor a " + nro1 + " y a " + nro3 );
        }
        else {
            System.out.println( nro3 + " es mayor a " + nro1 + " y a " + nro2 );
        }
    }
}
