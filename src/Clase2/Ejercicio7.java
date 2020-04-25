package Clase2;

public class Ejercicio7 {
    /*String usuario = “Pepito”, clave= “1234”;

Informar los siguientes casos:

Si usuario=”pepito” y clave=”1234” informar Bienvenido pepito!”

Si usuario=”pepito” y clave no es “1234” informar “Usuario incorrecto”

Si usuario no es “pepito” y clave= “1234” informar “Contraseña incorrecta”

     */
    public static void main(String[] args) {
        String usuario = "pepito";
        String clave = "12345";

        if (usuario.equals("pepito") && clave.equals("1234")){
            System.out.println("Bienvenido pepito!");
        }
        else if (usuario.equals("pepito") && !clave.equals("1234")){
            System.out.println("Usuario incorrecto");
        }
        else{
            System.out.println("Contraseña incorrecta");
        }

    }
}
