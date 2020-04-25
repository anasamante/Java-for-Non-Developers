package Clase5Ejercicios.Ejercicio3;

/*
Ejercicio 3
        Escribir un programa que tenga un procedimiento llamado mensaje, que imprima una palabra e invocar ese procedimiento 5 veces.
*/

public class MainMensaje {

    String mensaje;
    String imprimirMensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String imprimirMensaje(){
        System.out.println(this.getMensaje());
        return imprimirMensaje;
    }
}
