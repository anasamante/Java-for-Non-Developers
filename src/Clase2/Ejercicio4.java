package Clase2;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    Ingresar dos números y ofrecer al usuario un menú con las siguientes opciones:
    “1-suma 2-resta 3-producto 4-división”.
    Luego, mostrar el resultado de la operación aritmética elegida.

     */

    public static void main(String[] args) {
        System.out.println("ingrese el primer numero");

        Scanner scanner = new Scanner(System.in);
        double nro1 = scanner.nextInt();

        System.out.println("ingrese el segundo numero");
        double nro2 = scanner.nextInt();

        System.out.println("eliga una de las siguientes opciones de menu: 1-suma 2-resta 3-producto 4-división");
        int menuOption = scanner.nextInt();

        switch (menuOption){
            case 1:
                System.out.println("El resultado de la operación aritmética elegida es: " + (nro1+nro2));
                break;
            case 2:
                System.out.println("El resultado de la operación aritmética elegida es: " + (nro1-nro2));
                break;
            case 3:
                System.out.println("El resultado de la operación aritmética elegida es: " + (nro1*nro2));
                break;
            case 4:
                System.out.println("El resultado de la operación aritmética elegida es: " + (nro1/nro2));
                break;
            default:
                System.out.println("opcion incorrecta");
                break;
        }
        scanner.close();
    }
}
