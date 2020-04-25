package Clase5Ejercicios.Ejercicio6;
/*Ejercicio 6
        Escribir un procedimiento llamado “cierreDelDia” el cual invoca dos veces a la función “Iva” (tambien creada por
         nosotros), para calcular el Iva del 10.5% y 21% para el monto 1200. El procedimiento “cierreDelDia” debe ser
         invocado desde el “main”.*/
public class Main {

    private int monto;
    private double iva;
    private double mitadIva;
    private double montoIva;

    protected void setMonto(int monto) {
        this.monto = monto;
    }

    protected void setIva(double iva) {
        this.iva = iva;
    }

    protected void setMitadIva(double mitadIva) {
        this.mitadIva = mitadIva;
    }

    protected double getMontoIva (double iva){
        montoIva = monto * iva;
        return montoIva;
    }

    protected double getIva() {
        return iva;
    }

    protected double getMitadIva() {
        return mitadIva;
    }

}
