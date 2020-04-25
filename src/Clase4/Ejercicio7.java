package Clase4;/*Ejercicio 7
        Dado un vector del 0 al 11 con la facturación correspondiente a todo un año,
        informar la facturación por trimestre. Para esto,armar un vector de 4 posiciones, donde cada posición contenga la facturación de cada trimestre.*/

import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {

        double[] factAnual = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        double[] factTrimestral = new double[4];

        int totalTrimestre1 = 0;
        int totalTrimestre2 = 0;
        int totalTrimestre3 = 0;
        int totalTrimestre4 = 0;
        int i;


        for (i = 0; i < factAnual.length; i++) {
            if (i <= 2) {
                totalTrimestre1 += factAnual[i];
            }
            if (i > 2 && i < 6) {
                totalTrimestre2 += factAnual[i];
            }
            if (i > 5 && i < 9) {
                totalTrimestre3 += factAnual[i];
            }
            if (i >= 9) {
                totalTrimestre4 += factAnual[i];
            }
        }

        factTrimestral[0] = totalTrimestre1;
        factTrimestral[1] = totalTrimestre2;
        factTrimestral[2] = totalTrimestre3;
        factTrimestral[3] = totalTrimestre4;

        for (i = 0; i < factTrimestral.length; i++) {
            System.out.println("Facturacion trimestral " + (i+1) + " : " + factTrimestral[i]);
        }
    }
}
