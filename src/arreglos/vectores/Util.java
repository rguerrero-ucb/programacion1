package arreglos.vectores;

import java.util.Random;

public class Util {

    public static int[] generar(int tam) {
        int v[] = new int[tam];
        
        Random rnd = new Random();
        for (int i = 0; i < tam; i++) {
            v[i] = rnd.nextInt(100);
        }

        return v;
    }

    public static void imprimir(int v[]) {
        for (int valor : v) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    public static float promedio(int v[]) {
        int acum = 0;

        for (int valor : v) {
            acum = acum + valor;
        }

        float promedio = (float) acum / v.length;

        return promedio;
    }

    public static int[] generarFiboacci(int tam) {
        if (tam <= 0) {
            return new int[0];
        }

        if (tam == 1) {
            return new int[] { 0 };
        }

        int[] fib = new int[tam];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < tam; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }

    public static void duplicar(int v[]) {
        for (int i = 0; i < v.length; i++) {
            v[i] = v[i] * 2;
        }
    }

    public static void duplicarVariable(int a) {
        a = a * 2;
    }
}
