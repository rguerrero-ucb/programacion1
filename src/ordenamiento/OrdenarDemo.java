package ordenamiento;

import java.util.Arrays;
import java.util.Collections;

public class OrdenarDemo {
    public static void main(String[] args) {
        int [] datos = Util.generar(50000);

        // long inicio = System.currentTimeMillis();

        //System.out.println("Antes del intercambio:");
        //Util.imprimir(datos);

        int[] copia1 = Util.clone(datos);
        Medidor medIntercambio = new Medidor();
        Ordenador.intercambio(copia1, medIntercambio);
        System.out.println("Intercambio:");
        System.out.println("Intercambios: " + medIntercambio.intercambios);
        System.out.println("Comparaciones: " + medIntercambio.comparaciones);
        System.out.println("Duracion: " + medIntercambio.duracion + " ms");

                
        int[] copia2 = Util.clone(datos);
        Medidor medSeleccion = new Medidor();
        Ordenador.seleccion(copia2, medSeleccion);
        System.out.println("Seleccion:");
        System.out.println("Intercambios: " + medSeleccion.intercambios);
        System.out.println("Comparaciones: " + medSeleccion.comparaciones);
        System.out.println("Duracion: " + medSeleccion.duracion + " ms");

        //Util.imprimir(copia2);

        int[] copia3 = Util.clone(datos);
        Medidor medQsort = new Medidor();
        Ordenador.qsort(copia3, medQsort);
        System.out.println("Quicksort:");
        System.out.println("Intercambios: " + medQsort.intercambios);
        System.out.println("Comparaciones: " + medQsort.comparaciones);
        System.out.println("Duracion: " + medQsort.duracion + " ms");

        // long fin = System.currentTimeMillis();
        // long duracion = fin - inicio;
        // System.out.println("Duracion en milisegundos: " + duracion);

        Integer a[] = {5, 3, 8, 4, 2};

        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));


    }
}
