package banco;

import java.util.ArrayList;

public class Banco {
    public static void main(String[] args) {
        Cuenta cta1 = new Cuenta(1001, "Ana Perez", 500.0);
        //cta1.mostrarSaldo();

        cta1.depositar(150.0);
        //cta1.mostrarSaldo();

        cta1.retirar(700.0);
        //cta1.mostrarSaldo();

        Cuenta cta2 = new Cuenta(1002, "Luis Gomez", 800.0);

        ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
        lista.add(cta1);
        lista.add(cta2);
        lista.add(new Cuenta(1003, "Maria Rodriguez", 1200.0));
        lista.add(new Cuenta(1004, "Carlos Sanchez", 300.0));

        mostrarCuentas(lista);
    }

    public static void mostrarCuentas(ArrayList<Cuenta> lista) {
        for (Cuenta cta : lista) {
            cta.mostrarSaldo();
        }
    }
}
