package recursividad;

public class Uno {

    public static void main(String[] args) {
        //System.out.println(suma(5));
        //imprimir(5);
        //imprimir2(1, 5);
        imprimir3(5);
    }

    public static int suma(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + suma(n - 1);
        }
    }

    public static void imprimir(int n) {
        if (n > 0) {
            System.out.println(n);
            imprimir(n - 1);
        }
    }

    public static void imprimir2(int desde, int hasta) {
        if (desde <= hasta) {
            System.out.println(desde);
            imprimir2(desde + 1, hasta);
     
        }
    }

    public static void imprimir3(int n) {
        if (n > 0) {
            imprimir3(n - 1);
            System.out.println(n);
        }
    }


}
