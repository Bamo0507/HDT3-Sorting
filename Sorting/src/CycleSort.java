//Nombre: Bryan Alberto Martínez Orellana
//Carné: 23542
//Nombre: Adriana Sophia Palacios Contreras
//Carné: 23044
//Fecha de Creación: 04/02/2024
//Fecha de Última Modificacion: 07/02/2024

//Hoja de Trabajo 3 - Sorts

import java.util.Arrays;

/**
 * Clase que implementa el algoritmo de Cycle Sort para ordenar un array de elementos comparables.
 */
public class CycleSort {

    /**
     * Método para ordenar un array utilizando el algoritmo de Cycle Sort.
     * @param arr Array a ordenar.
     * @param <T> Tipo de elementos en el array, debe ser comparable.
     */
    public static <T extends Comparable<T>> void sort(T[] arr) {
        int n = arr.length;

        // Itera sobre el array
        for (int inicio = 0; inicio < n - 1; inicio++) {
            T actual = arr[inicio];
            int posicion = inicio;

            // Encuentra la posición donde se debe colocar el elemento
            for (int i = inicio + 1; i < n; i++) {
                if (arr[i].compareTo(actual) < 0) {
                    posicion++;
                }
            }

            // Si el elemento ya está en la posición correcta, continúa con el siguiente elemento
            if (posicion == inicio) {
                continue;
            }

            // De lo contrario, coloca el elemento en la posición correcta
            while (actual.equals(arr[posicion])) {
                posicion++;
            }

            // Intercambia los elementos
            T temp = arr[posicion];
            arr[posicion] = actual;
            actual = temp;

            // Rota el ciclo hasta que el elemento esté en la posición correcta
            while (posicion != inicio) {
                posicion = inicio;
                for (int i = inicio + 1; i < n; i++) {
                    if (arr[i].compareTo(actual) < 0) {
                        posicion++;
                    }
                }

                while (actual.equals(arr[posicion])) {
                    posicion++;
                }

                temp = arr[posicion];
                arr[posicion] = actual;
                actual = temp;
            }
        }
    }

}
