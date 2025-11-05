package ordenamiento;

public class IntercambioDemo {
    public static void main(String[] args) {
        int [] datos = {8, 4, 6, 2};

        System.out.println("Antes del intercambio:");
        Util.imprimir(datos);

        int[] copia1 = Util.clone(datos);
        Ordenador.intercambio(copia1);
        System.out.println("Intercambio:");
        Util.imprimir(copia1);

        int[] copia2 = Util.clone(datos);
        System.out.println("Seleccion:");
        Ordenador.seleccion(copia2);
        Util.imprimir(copia2);

    }
}
