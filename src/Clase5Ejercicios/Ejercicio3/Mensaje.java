package Clase5Ejercicios.Ejercicio3;
/*
Ejercicio 3
        Escribir un programa que tenga un procedimiento llamado mensaje, que imprima una palabra e invocar ese procedimiento 5 veces.
*/
public class Mensaje {
    public static void main(String[] args) {

        MainMensaje mensaje = new MainMensaje();

        mensaje.setMensaje("Una palabra");

        for (int i =0; i<5; i++){
            mensaje.imprimirMensaje();
        }
    }
}
