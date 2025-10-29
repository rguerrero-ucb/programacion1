package strings;

public class Principal {
    public static void main(String[] args) {
        // String texto = new String("hola");
        String texto1 = "hola" + " que tal";

        String texto2 = "hola";
        texto2 = texto2.concat(" que tal");

        System.out.println(texto1);
        System.out.println(texto2);

        System.out.println("texto 1 mide " + texto1.length());
        System.out.println("cacater 5 " + texto2.charAt(5));

        System.out.println(texto2.toUpperCase());

        String data = "20|pedro|2000";
        String[] valores = data.split("\\|");
        for (String valor : valores) {
            System.out.println(valor);
        }
        System.out.println();

        if (texto1.equals(texto2)) {
            System.out.println("Son iguales con ==");
        } else {
            System.out.println("Son diferentes con ==");
        }

        String texto3 = "  hola que tal   ";
        System.out.println(">" + texto3 + "<");
        System.out.println(">" + texto3.trim() + "<");

        System.out.println(texto3.replace(" ", "_"));
        System.out.println(texto3.substring(2, 6));
        System.out.println("posición e 'que': " + texto3.indexOf("que"));
        if (texto1.startsWith("hola")) {
            System.out.println("Empieza con hola...");
        }

        if (texto2.endsWith("tal")) {
            System.out.println("Termina con tal...");
        }
    }
}
