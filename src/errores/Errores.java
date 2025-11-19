package errores;

import javax.swing.JOptionPane;

public class Errores {
    public static void main(String[] args) {    
        try{
            int numero = dividir(4, 20);
            System.out.println("El número es: " + numero);
        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(),
             "Error artmético", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(),
             "Error de división", JOptionPane.ERROR_MESSAGE);
        } finally {
            System.out.println("fin");
        }
    }

    static int dividir(int a, int b) throws Exception, ArithmeticException   {
            if (b > a){
                throw new Exception("El divisor no puede ser mayor que el dividendo");
            }
            int c = a / b;
            return c;
    }
}
