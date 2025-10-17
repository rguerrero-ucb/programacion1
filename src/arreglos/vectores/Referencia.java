package arreglos.vectores;

public class Referencia {
    
public static void main(String[] args) {
        int m[] = Util.generar(5);
        Util.imprimir(m);

        Util.duplicar(m);
        Util.imprimir(m);

        int n = 10;
        System.out.println("n antes: " + n);
        Util.duplicarVariable(n);
        System.out.println("n despues: " + n);
    }


}
