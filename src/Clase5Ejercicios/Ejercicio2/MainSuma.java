package Clase5Ejercicios.Ejercicio2;
/*Ejercicio 2
        Crear un función suma, que reciba dos parámetros uno de tipo entero y otro de tipo double, que realice la suma y retorne la suma de
        ambos como un double*/

public class MainSuma {
    int valor1;
    double valor2;
    double resultado;

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getResultado() {
        resultado = valor1 + valor2;
        return resultado;
    }


}
