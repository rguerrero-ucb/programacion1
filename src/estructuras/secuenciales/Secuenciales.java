package estructuras.secuenciales;

import javax.swing.JOptionPane;

public class Secuenciales {
    public static void main(String[] args) {
        System.out.println(args[0]);
        int h = 10;
        String numero = String.valueOf(h);
        JOptionPane.showMessageDialog(null, "Hola Mundo:" + numero);

        int a = 10;
        int b = 20;

        int c = a;
        a = b;
        b = c;

        c = a * 10 + 5 * 2;

        a = 1;
        a = a + 10;
        a = a + 2 * a;

        boolean x;
        c = 8;
        x = !((3 * c - 2) > 21 / 3);
        
        System.out.println("a: " + a); 
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("x: " + x);

    }
}
