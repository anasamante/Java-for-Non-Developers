package Clase5;

public class Prueba {
    public static void main(String[] args) {

        String[] strings = {"Raul", "Geomar", "Peña", "Juan"};

        int cantidad= 0;
        int i = 0;

        do {
            if (!strings[i].toLowerCase().startsWith("j")) {
                i++;
                continue;
            }
            cantidad++;
            i++;
        } while( i < strings.length );

        System.out.println ("(" + cantidad + ") palabras comienzan con \"j\"");

    }
}
