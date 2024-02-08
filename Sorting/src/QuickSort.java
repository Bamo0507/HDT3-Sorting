//Nombre: Bryan Alberto Martínez Orellana
//Carné: 23542
//Nombre: Adriana Sophia Palacios Contreras
//Carné: 23044
//Fecha de Creación: 04/02/2024
//Fecha de Última Modificacion: 07/02/2024

//Hoja de Trabajo 3 - Sorts

import java.util.Arrays;

/**
 * Clase que implementa el algoritmo de Quick Sort para ordenar un array de elementos comparables.
 */
public class QuickSort {

    /**
     * Método para ordenar un array utilizando el algoritmo de Quick Sort.
     * @param array Array a ordenar.
     * @param <T> Tipo de elementos en el array, debe ser comparable.
     */
    public static <T extends Comparable<T>> void sort(T[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        quickSort(array, 0, array.length - 1);
    }

    /**
     * Método privado que implementa el algoritmo de Quick Sort de manera recursiva.
     * @param array Array a ordenar.
     * @param low Índice más bajo del rango a ordenar.
     * @param high Índice más alto del rango a ordenar.
     * @param <T> Tipo de elementos en el array, debe ser comparable.
     */
    private static <T extends Comparable<T>> void quickSort(T[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);

            // Recursivamente ordenar los elementos antes y después del índice de partición
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    /**
     * Método privado que realiza la partición del array para el Quick Sort.
     * @param array Array a ordenar.
     * @param low Índice más bajo del rango a ordenar.
     * @param high Índice más alto del rango a ordenar.
     * @param <T> Tipo de elementos en el array, debe ser comparable.
     * @return Índice de partición.
     */
    private static <T extends Comparable<T>> int partition(T[] array, int low, int high) {
        T pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;

                // Intercambiar array[i] y array[j]
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Intercambiar array[i+1] y array[high] (o el pivote)
        T temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
