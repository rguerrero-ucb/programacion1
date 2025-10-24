package poo;

public class Coche {
    // Atributos
    public String color;
    private String modelo;
    public int velocidadMaxima;
    private int velocidad;
    // Constructor
    
    public Coche(String modeloNuevo) {
        color = "gris";
        modelo = modeloNuevo;
        velocidadMaxima = 120;
        velocidad = 0;
    }
    // Métodos
    public void acelerar(int incremento) {        
        this.velocidad += incremento;
        if (this.velocidad > this.velocidadMaxima) {
            this.velocidad = this.velocidadMaxima;
        }
    }
    public void frenar(int decremento) {
        this.velocidad -= decremento;
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
    }
    public void mostrarEstado() {
        System.out.println("Modelo: " + modelo 
        + ", Color: " + color 
        + ", Velocidad: " + velocidad + " km/h");
    }
}