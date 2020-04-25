package Clase3;

public class Ejercicio9For {
    public static void main(String[] args) {

      /*  Ejercicio 9
Imprimir la siguiente figura:
@@@@@
@@@@
@@@
@@
@
*/
        for (int n = 1; n < 6; n++){
            for (int i = 6; i > n; i--){
                System.out.print("@");
            }
            System.out.println();
        }

    }
}
