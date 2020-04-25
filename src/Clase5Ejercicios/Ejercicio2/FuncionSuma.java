package Clase5Ejercicios.Ejercicio2;

/*Ejercicio 2
        Crear un función suma, que reciba dos parámetros uno de tipo entero y otro de tipo double, que realice la suma y retorne la suma de
        ambos como un double*/

public class FuncionSuma {
    public static void main(String[] args) {
        MainSuma suma = new MainSuma();

        suma.setValor1(32);

        suma.setValor2(45.23);

        suma.getResultado();

        System.out.println(suma.resultado);

    }

}
