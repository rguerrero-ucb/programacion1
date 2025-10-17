package estructuras.repetitivas;

import java.util.Scanner;

public class Acumulador {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Número: ");
        int num = scan.nextInt();
        int acum = 0;
        while (num != 0){
            acum = acum + num;
            System.out.println("Número: ");
            num = scan.nextInt();
        }

        System.out.println("Total: " + acum);

    }
}
