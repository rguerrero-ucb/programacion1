package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Texto {
    public static void main(String args[]) {
        //escribirTexto();
        leerTexto();
    }

    static void escribirTexto() {
        File file = new File("/home/ronal/Escritorio/archivo.txt");
        try {
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Hola, este es un archivo de texto.");
            bufferedWriter.newLine();
            bufferedWriter.write("Esta es la segunda línea.");
            bufferedWriter.close();
            writer.close();
        } catch (Exception e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    static void leerTexto() {
        try {
            File file = new File("/home/ronal/Escritorio/archivo.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
            bufferedReader.close();
            fileReader.close();


        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

}
