package archivos;

import java.io.File;

public class DemoFile {
    public static void main(String[] args) {
        File file = new File("/home/ronal/Escritorio");

        if (file.exists()) {
            System.out.println("El archivo existe.");
            System.out.println("Ruta absoluta: " + file.getAbsolutePath());
            System.out.println("¿Es un directorio? " + file.isDirectory());
            System.out.println("¿Es un archivo? " + file.isFile());
            System.out.println("Tamaño del archivo (bytes): " + file.length());
            System.out.println("Última modificación: " + file.lastModified());
        } else {
            System.out.println("El archivo no existe.");
        }
        
        // lsitar archivos
        if(file.isDirectory()){
            String[] archivos = file.list();
            System.out.println("Contenido del directorio:");
            for(String nombreArchivo : archivos){
                System.out.println(nombreArchivo);
            }
        }


    }
}
