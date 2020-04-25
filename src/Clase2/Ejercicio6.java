package Clase2;

public class Ejercicio6 {
    /*Dado el siguiente código:
    int a = 10, b=-2, c=5; // hay 2 números positivos y 1 negativo
    Informar la multiplicación de los dos números positivos
    */
    public static void main(String[] args) {
        int a = -10, b=2, c=5;
         if (a>0 && b>0){
             System.out.println("a*b = " + a*b);
         }
        else if(a>0 && c>0){
             System.out.println("a*c = " + a*c);
        }
        else {
             System.out.println("b*c = " + b*c);
         }
    }
}
