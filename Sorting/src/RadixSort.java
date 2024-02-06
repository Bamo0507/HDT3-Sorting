import java.util.Arrays;

public class RadixSort {

    // Método para encontrar el máximo valor en un arreglo
    private static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];
        for (T value : arr) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }

    // Método principal de Radix Sort
    public static <T extends Comparable<T>> void radixSort(T[] arr) {
        // Encontrar el máximo valor para determinar la cantidad de dígitos
        T max = findMax(arr);
        int exp = 1;

        // Aplicar Radix Sort para cada dígito
        while (((Integer) max).intValue() / exp > 0) {
            countingSort(arr, exp);
            exp *= 10;
        }
    }

    // Método auxiliar Counting Sort para un dígito específico
    private static <T extends Comparable<T>> void countingSort(T[] arr, int exp) {
        int n = arr.length;
        T[] output = Arrays.copyOf(arr, n);
        int[] count = new int[10];

        // Inicializar el arreglo de conteo
        Arrays.fill(count, 0);

        // Contar la frecuencia de cada dígito
        for (int i = 0; i < n; i++) {
            count[((Integer) arr[i]).intValue() / exp % 10]++;
        }

        // Calcular las posiciones finales de los elementos
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Construir el arreglo de salida
        for (int i = n - 1; i >= 0; i--) {
            int index = ((Integer) arr[i]).intValue() / exp % 10;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }

        // Copiar el arreglo de salida al arreglo original
        System.arraycopy(output, 0, arr, 0, n);
    }

}
