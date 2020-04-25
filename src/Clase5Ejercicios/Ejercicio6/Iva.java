package Clase5Ejercicios.Ejercicio6;
/*Ejercicio 6
        Escribir un procedimiento llamado “cierreDelDia” el cual invoca dos veces a la función “Iva” (tambien creada por
         nosotros), para calcular el Iva del 10.5% y 21% para el monto 1200. El procedimiento “cierreDelDia” debe ser
         invocado desde el “main”.*/
public class Iva {
    public static void main(String[] args) {

        Main cierreDelDia =  new Main();

        cierreDelDia.setMonto(1200);
        cierreDelDia.setIva(0.21);
        cierreDelDia.setMitadIva(0.105);
        double a=cierreDelDia.getMontoIva(cierreDelDia.getIva());
        double b=cierreDelDia.getMontoIva(cierreDelDia.getMitadIva());

        System.out.println(a);
        System.out.println(b);

    }
}
