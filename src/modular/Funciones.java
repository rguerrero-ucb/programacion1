package modular;

public class Funciones {
    public static void main(String args[]) {
        int x = 20;
        int resultado = duplicar(x);
        System.out.println(resultado);
        System.out.println(comparar(duplicar(6), 5));

        imprimir(10);
    }

    public static int duplicar(int num) {
        num = num * 2;
        return num;
    }

    public static String comparar(int a, int b) {
        if (a < b) {
            return "b es mayor";
        } else {
            if (a == b) {
                return "a es igual a b";
            } else {
                return "a es mayor";
            }

        }
    }

    public static void imprimir(int a){
        System.out.println(a);
    }

}
