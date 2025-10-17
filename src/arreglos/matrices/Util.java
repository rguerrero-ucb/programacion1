package arreglos.matrices;

import java.util.Random;

public class Util {
    public static void imprimir(int[][] matriz) {
        int filas = matriz.length;
        int cols = matriz[0].length;

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generar(int filas, int cols) {
        Random rnd = new Random();

        int[][] m = new int[filas][cols];

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < cols; c++) {
                m[f][c] = rnd.nextInt(100);
            }
        }

        return m;

    }
}
