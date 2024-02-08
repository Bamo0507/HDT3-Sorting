//Nombre: Bryan Alberto Martínez Orellana
//Carné: 23542
//Nombre: Adriana Sophia Palacios Contreras
//Carné: 23044
//Fecha de Creación: 04/02/2024
//Fecha de Última Modificacion: 07/02/2024

//Hoja de Trabajo 3 - Sorts

import java.util.Arrays;

/**
 * Clase que implementa el algoritmo de Merge Sort para ordenar un array de elementos comparables.
 * @param <T> Tipo de elementos en el array, debe ser comparable.
 */
public class MergeSort<T extends Comparable<T>> {

    /**
     * Método público para iniciar el proceso de ordenación utilizando Merge Sort.
     * @param array Array a ordenar.
     */
    public void sort(T[] array) {
        mergeSort(array);
    }

    /**
     * Método privado recursivo que implementa el algoritmo de Merge Sort.
     * @param array Array a ordenar.
     */
    private void mergeSort(T[] array) {
        if (array.length > 1) {
            int medio = array.length / 2;
            T[] izquierda = Arrays.copyOfRange(array, 0, medio);
            T[] derecha = Arrays.copyOfRange(array, medio, array.length);

            mergeSort(izquierda);
            mergeSort(derecha);

            merge(array, izquierda, derecha);
        }
    }

    /**
     * Método privado para combinar dos arrays ordenados en uno solo.
     * @param array Array resultante de la combinación.
     * @param izquierda Array izquierdo.
     * @param derecha Array derecho.
     */
    private void merge(T[] array, T[] izquierda, T[] derecha) {
        int i = 0, j = 0, k = 0;
        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i].compareTo(derecha[j]) < 0) {
                array[k] = izquierda[i];
                i++;
            } else {
                array[k] = derecha[j];
                j++;
            }
            k++;
        }

        // Agrega los elementos restantes de izquierda
        while (i < izquierda.length) {
            array[k] = izquierda[i];
            i++;
            k++;
        }

        // Agrega los elementos restantes de derecha
        while (j < derecha.length) {
            array[k] = derecha[j];
            j++;
            k++;
        }
    }
}
