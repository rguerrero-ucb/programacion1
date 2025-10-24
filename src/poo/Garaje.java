package poo;

public class Garaje {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Ford");
        // miCoche.color = "Rojo";
        // miCoche.modelo = "Toyota";
        // miCoche.velocidadMaxima = 180;

        miCoche.acelerar(50);
        miCoche.mostrarEstado();

        miCoche.frenar(20);
        miCoche.mostrarEstado();

        miCoche.acelerar(200);
        miCoche.mostrarEstado();
        //miCoche.Vaciar();


        Volqueta miVolqueta = new Volqueta("Volvo");
        miVolqueta.color = "Amarillo";
        miVolqueta.velocidadMaxima = 100;
        miVolqueta.acelerar(80);
        miVolqueta.mostrarEstado();
        miVolqueta.Vaciar();
    }
}
