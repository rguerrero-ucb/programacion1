package archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DemoStream {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Ana", 28));
        listaPersonas.add(new Persona("Carlos", 22));

        // for (Persona p : listaPersonas) {
        //     p.imprimir();
        // }

        guardarPersonas(listaPersonas);
        leerPersonas();
    }

    static void guardarPersonas(ArrayList<Persona> personas) {
        File file = new File("/home/ronal/Escritorio/personas.dat");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Persona p : personas) {
                oos.writeObject(p);
            }
            oos.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void leerPersonas() {
        File file = new File("/home/ronal/Escritorio/personas.dat");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                try {
                    Persona p = (Persona) ois.readObject();
                    p.imprimir();
                } catch (Exception e) {
                    break; // End of file reached
                }
            }
            ois.close();
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
