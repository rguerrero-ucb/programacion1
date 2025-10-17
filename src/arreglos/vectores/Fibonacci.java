package arreglos.vectores;

public class Fibonacci {
    public static void main(String args[]) {
        // int a[] = Util.generar(5);
        // Util.imprimir(a);
        // float promedio = Util.promedio(a);
        // System.out.println("promedio = " + promedio);

        int fibo[] = Util.generarFiboacci(20);
        Util.imprimir(fibo);
    }
}
