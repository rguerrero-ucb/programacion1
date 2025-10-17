package estructuras.secuenciales;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Hola " + nombre + ", ¿cómo estás?");
        System.out.println("Por favor, ingresa tu edad: ");
        int edad = scan.nextInt();
        System.out.println("Tienes " + edad + " años.");
    }

}
