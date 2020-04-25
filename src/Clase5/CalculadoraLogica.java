package Clase5;

public class CalculadoraLogica {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.setPrimerNro(10);
        calculadora.setSegundoNro(20);
        calculadora.setOperacion(0);
        calculadora.calcular();

        double resultado = calculadora.getResultado();

        System.out.println(resultado);

    }
}
