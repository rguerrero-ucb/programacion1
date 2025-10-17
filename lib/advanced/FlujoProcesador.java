package advanced;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class FlujoProcesador {
    
    public static void leerFlujo(InputStream inputStream, int batchSize) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream), 1048576);
        StringBuilder numberBuffer = new StringBuilder();
        int[] batch = new int[batchSize];
        int batchCount = 0;
        int ch;

        while ((ch = br.read()) != -1) {
            if (ch == ' ' || ch == '\n' || ch == '\r') {
                if (numberBuffer.length() > 0) {
                    batch[batchCount++] = Integer.parseInt(numberBuffer.toString());
                    numberBuffer.setLength(0);
                    
                    if (batchCount == batchSize) {
                        procesarBatch(batch, batchCount);
                        batchCount = 0;
                    }
                }
            } else {
                numberBuffer.append((char) ch);
            }
        }

        // Procesar último lote si queda
        if (batchCount > 0) {
            procesarBatch(Arrays.copyOf(batch, batchCount), batchCount);
        }
        
        br.close();
    }
    
    public static InputStream generarFlujo(long cantidadNumeros) {
        return new InputStream() {
            private long numerosGenerados = 0;
            private Random random = new Random();
            private StringBuilder buffer = new StringBuilder();
            private int bufferPos = 0;
            
            @Override
            public int read() throws IOException {
                if (bufferPos >= buffer.length()) {
                    if (numerosGenerados >= cantidadNumeros) {
                        return -1; // EOF
                    }
                    
                    // Generar siguiente número
                    int numero = random.nextInt(1000); // números 0-999
                    buffer.setLength(0);
                    buffer.append(numero);
                    
                    // Agregar espacio excepto para el último número
                    if (numerosGenerados < cantidadNumeros - 1) {
                        buffer.append(' ');
                    }
                    
                    bufferPos = 0;
                    numerosGenerados++;
                }
                
                return buffer.charAt(bufferPos++);
            }
        };
    }
    
    private static void procesarBatch(int[] batch, int size) {
        // System.out.print("Batch: ");
        // for (int i = 0; i < size; i++) {
        //     System.out.print(batch[i] + " ");
        // }
        // System.out.println();
    }
    
    public static void main(String[] args) {
        try {
            long cantidadNumeros = 10000000;
            int batchSize = 20;
            
            System.out.println("Generando flujo con " + cantidadNumeros + " números");
            System.out.println("Procesando en lotes de " + batchSize);
            System.out.println("----------------------------------------");
            
            InputStream flujo = generarFlujo(cantidadNumeros);
            leerFlujo(flujo, batchSize);
            
            System.out.println("----------------------------------------");
            System.out.println("Procesamiento completado");
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}