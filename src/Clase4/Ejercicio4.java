package Clase4;/*Ejercicio 4
        Uso de vector con ingreso de datos por teclado
        Ingrese por teclado la facturación de los últimos 6 meses.Solo se pueden ingresar números.
        Informar:
        a)la facturación total
        b)el promedio de facturación
        c)la máxima facturación
        d)la máxima facturación*/
//TODO: enviar para corregir
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        double[] factSemestral = new double[6];
        double factTotal = 0;
        double factMaxima = factSemestral[0];
        double factMinima = Double.MAX_VALUE;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la facturación de los últimos 6 meses");

        for( int i = 0; i < factSemestral.length; i++){
            factSemestral[i] = teclado.nextDouble();
            factTotal += factSemestral[i];
            if (factSemestral[i]> factMaxima ){
                factMaxima = factSemestral[i];
            }
            if (factSemestral[i] < factMinima){
                factMinima = factSemestral[i];
            }
        }
        teclado.close();
        System.out.println("la facturación total es " + factTotal);
        System.out.println("el promedio de facturación es " + factTotal / factSemestral.length);
        System.out.println("la facturacion maxima es " + factMaxima );
        System.out.println("la facturacion minima es " + factMinima );
    }
}
