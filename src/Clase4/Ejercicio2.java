package Clase4;

/*      Ejercicio 2
        Dado el vector inflación {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9}
        Cada ítem del vector representa la inflación de un mes de tal manera que el primer ítem del vector
        que es 0.8 representa la inflación de Enero, y el último ítem del vector que es 0.9 representa la inflación de diciembre.
        Se pide:
        1.Informar la inflación anual
        2.Informar la inflación más baja, junto con el número de mes. Por ejemplo: Mes 2 = 0.1
        3.Informar la inflación más alta, junto con el número de mes. Por ejemplo: Mes 12 = 0.9
        4.Informar el promedio de inflación (inflación total / 2)*/
public class Ejercicio2 {
    public static void main(String[] args) {

        double[] inflacion = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};

        double anual = 0;
        double baja = inflacion[0];
        double alta = inflacion[0];

        int mesBaja = 0;
        int mesAlta = 0;

        for (int i = 0; i < inflacion.length; i++) {
            anual += inflacion[i];

            if (inflacion[i] > alta) {
                alta = inflacion[i];
                mesAlta = i + 1;
            }


            if (inflacion[i] < baja) {
                baja = inflacion[i];
                mesBaja = i + 1;
            }
        }
        System.out.println("La inflación anual es " + anual);
        System.out.println("Mes inflacion alta: " + mesAlta + " = " + alta);
        System.out.println("Mes inflacion baja: " + mesBaja + " = " + baja);
        System.out.println("El promedio anual es " + anual / inflacion.length);
    }
}
