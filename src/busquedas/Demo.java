package busquedas;

public class Demo {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int pos = Buscador.busquedaLineal(a, 4);
        System.out.println("Posicion: " + pos);

        int posBinaria = Buscador.busquedaBinaria(a, 4);
        System.out.println("Posicion (binaria): " + posBinaria);
    }
}