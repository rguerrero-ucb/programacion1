package archivos;

public class Persona implements java.io.Serializable {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimir(){
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
