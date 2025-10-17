package estructuras.repetitivas;

import java.util.Scanner;

public class Estadistica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int suma = 0;
        int count = 0;

        System.out.print("Num: ");
        int num = scan.nextInt();
        int min = num;
        int max = num;

        while (num != 0) {
            count++;
            suma = suma + num;

            if (num < min){
                min = num;
            }

            if (num > max) {
                max = num;
            }

            System.out.print("Num: ");
            num = scan.nextInt();
        }

        System.out.println("Cantidad: " + count);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Suma: " + suma);

        float promedio = (float) suma/count;
        System.out.println("Promedio: " + promedio);
    }
}
