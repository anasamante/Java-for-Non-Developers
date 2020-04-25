package Clase4;

/*      Ejercicio 3
Agregar los cambios que resulten necesarios al ejercicio anterior para que en los puntos b y c
se informe la inflación junto con el nombre del mes. Por ejemplo: Mes FEBRERO = 0.1
2.Informar la inflación más baja, junto con el número de mes. Por ejemplo: Mes 2 = 0.1
        3.Informar la inflación más alta, junto con el número de mes. Por ejemplo: Mes 12 = 0.9
        */
public class Ejercicio3 {
    public static void main(String[] args) {

        double[] inflacion = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};
        String[] meses = {"enero","febrero","marzo","abri","mayo","junio","julio","agosto",
                "septiembre","octubre","noviembre","diciembre"};

        double anual = 0;
        double baja = inflacion[0];
        double alta = inflacion[0];

        String mesBaja = "";
        String mesAlta = "";

        for (int i = 0; i < inflacion.length; i++) {
            anual += inflacion[i];

            if (inflacion[i] > alta) {
                alta = inflacion[i];
                mesAlta = meses[i];
            }


            if (inflacion[i] < baja) {
                baja = inflacion[i];
                mesBaja = meses[i];
            }
        }
        System.out.println("La inflación anual es " + anual);
        System.out.println("Mes inflacion alta: " + mesAlta + " = " + alta);
        System.out.println("Mes inflacion baja: " + mesBaja + " = " + baja);
        System.out.println("El promedio anual es " + anual / inflacion.length);
    }
}
