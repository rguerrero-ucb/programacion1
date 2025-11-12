package ordenamiento;

class Ordenador {

    public static void intercambio(int[] v, Medidor medidor) {
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                medidor.comparaciones++;
                if (v[i] > v[j]) {
                    medidor.intercambios++;
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        long fin = System.currentTimeMillis();
        medidor.duracion = fin - inicio;

    }

    public static void burbuja(int[] v) {
        boolean huboIntercambio;
        do {
            huboIntercambio = false;
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] > v[i + 1]) {
                    int aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                    huboIntercambio = true;
                }
            }
        } while (huboIntercambio);
    }

    public static void seleccion(int[] v, Medidor medidor) {
        long inicio = System.currentTimeMillis();


        int n = v.length;
        int minIdx = 0;

        for (int i = 0; i < n - 1; i++) {
            minIdx = i;
            for (int j = i + 1; j < n; j++) {
                medidor.comparaciones++;
                if (v[j] < v[minIdx]) {
                    minIdx = j;
                }
            }
            medidor.comparaciones++;
            if (minIdx != i) {
                medidor.intercambios++;
                int aux = v[minIdx];
                v[minIdx] = v[i];
                v[i] = aux;
            }
        }

        long fin = System.currentTimeMillis();
        medidor.duracion = fin - inicio;
    }

    public static void qsort(int v[], Medidor medidor) {
        long inicio = System.currentTimeMillis();

        quicksort(v, 0, v.length - 1, medidor);

        long fin = System.currentTimeMillis();
        medidor.duracion = fin - inicio;
    }

    private static void quicksort(int[] v, int izq, int der, Medidor medidor) {
        int i = izq;
        int j = der;
        int pivote = v[(izq + der) / 2];

        do {
            while (v[i] < pivote){
                medidor.comparaciones++;
                i++;
            }
            
            while (v[j] > pivote){
                medidor.comparaciones++;
                j--;
            }

            if (i <= j) {
                if (i < j) {
                    medidor.intercambios++;
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
                i++;
                j--;
            }
        } while (i <= j);

        if (izq < j)
            quicksort(v, izq, j, medidor);
        if (i < der)
            quicksort(v, i, der, medidor);
    }
}