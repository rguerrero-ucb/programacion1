package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Texto {
    public static void main(String args[]) {
        //escribirTexto();
        //leerTexto();
        //int vector[] = {10,20,30,40,50};
        //guardarVector(vector);
        //leerVector();
        guardarTextoStream();
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
        String n = "100";
        int x = Integer.parseInt(n);
        String c = String.valueOf(x);
        ;
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

    static void guardarVector(int vector[]){
        File file = new File("/home/ronal/Escritorio/vector.dat");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);

            for (int i = 0; i < vector.length; i++) {
                dos.writeInt(vector[i]);
            }

            dos.close();
            fos.close();
            
        } catch (Exception e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    static void leerVector(){
        File file = new File("/home/ronal/Escritorio/vector.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() > 0) {
                int numero = dis.readInt();
                System.out.println(numero);
            }

            dis.close();
            fis.close();
            
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }    
    }

    static void guardarTextoStream() {
        File file = new File("/home/ronal/Escritorio/archivo_stream.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(System.out);
            String contenido = "Este es un archivo de texto usando streams.";
            dos.writeUTF(contenido);
            dos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

}
