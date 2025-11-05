package ordenamiento;

class Ordenador {

    public static void intercambio(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
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

    public static void seleccion(int[] v) {
        int n = v.length;
        int minIdx = 0;

        for (int i = 0; i < n - 1; i++) {
            minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (v[j] < v[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int aux = v[minIdx];
                v[minIdx] = v[i];
                v[i] = aux;
            }
        }
    }

}