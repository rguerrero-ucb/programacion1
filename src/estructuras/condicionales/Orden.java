package estructuras.condicionales;

public class Orden {
    public static void main(String[] args) {
        int a = 5;
        int b = 30;
        int c = 20;
        int primero = 0, segundo = 0, tercero = 0;

        if (a <= b && a <= c) {
            primero = a;
            if (b < c) {
                segundo = b;
                tercero = c;
            } else {
                segundo = c;
                tercero = b;
            }
        }
        

        System.out.println(primero);
        System.out.println(segundo);
        System.out.println(tercero);
    }
}
