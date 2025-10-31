package ordenamiento;

public class IntercambioDemo {
    public static void main(String[] args) {
        int [] datos = {8, 4, 6, 2};

        System.out.println("Antes del intercambio:");
        Util.imprimir(datos);
        
        Ordenador.intercambio(datos);
        
        System.out.println("Después del intercambio:");
        Util.imprimir(datos);
    }
}
