package Clase5;

public class Calculadora {
    private double primerNro;
    private double segundoNro;
    private int operacion = 0;
    private double resultado;

    public Calculadora() {

    }

    public void calcular(){
        switch(this.operacion){
            case 0: {
                this.resultado = this.primerNro + this.segundoNro;
                break;
            }
            case 1: {
                this.resultado = this.primerNro - this.segundoNro;
                break;
            }
            case 2: {
                this.resultado = this.primerNro * this.segundoNro;
                break;
            }
            case 3:
                 this.resultado = this.primerNro / this.segundoNro;
                 break;
                 
        }
    }

    public double getPrimerNro() {
        return primerNro;
    }

    public void setPrimerNro(double primerNro) {
        this.primerNro = primerNro;
    }

    public double getSegundoNro() {
        return segundoNro;
    }

    public void setSegundoNro(double segundoNro) {
        this.segundoNro = segundoNro;
    }

    public int getOperacion() {
        return operacion;
    }

    public void setOperacion(int operacion) {
        this.operacion = operacion;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void borrar(){
        this.operacion = -1;
        this.resultado = 0;
        this.primerNro = 0;
        this.segundoNro = 0;
    }

}
