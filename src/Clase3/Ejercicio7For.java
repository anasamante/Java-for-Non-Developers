package Clase3;

public class Ejercicio7For {
    public static void main(String[] args) {

      /*  Ejercicio 7
        Imprimir la siguiente figura:

        @

        @@

        @

        @@

        @*/

        for(int num = 1; num <=5; num++ ){

            if(num % 2 == 0) {
                System.out.println("@@");
            }else{
                System.out.println("@");
            }
        }

    }
}
