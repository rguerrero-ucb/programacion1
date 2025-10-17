package arreglos.matrices;

public class Main {
    public static void main(String[] args) {
        // int[][] m = new int[3][4];
        // m[2][3] = 5;

        int[][] m = Util.generar(3, 5);
        Util.imprimir(m);
    }
}
