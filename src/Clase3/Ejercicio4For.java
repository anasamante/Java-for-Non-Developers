package Clase3;

public class Ejercicio4For {
    public static void main(String[] args) {

//        Imprimir la suma de los números impares del 1 al 10

        int suma =0;

        for(int num = 1; num <=10; num++){
            if(num % 2 !=0){
                suma+=num;
            }
        }
        System.out.println("la suma de los números impares del 1 al 10 es " + suma);
    }
}
