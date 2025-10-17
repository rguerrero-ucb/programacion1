package arreglos.vectores;

import java.util.Random;

public class Unidimensional {

    public static void main(String[] args) {
        Random rnd = new Random();

        int a[] = new int[100];

        int i = 0;
        while (i < 100) {
            a[i] = rnd.nextInt(50);
            i++;
        }
        
        for(int j = 0; j < 100; j++){
            System.out.print(a[j] + " ");
        }
        System.out.println();

        for(int elemento : a){
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

}
