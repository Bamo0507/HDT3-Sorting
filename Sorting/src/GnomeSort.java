//Nombre: Bryan Alberto Martínez Orellana
//Carné: 23542
//Nombre: Adriana Sophia Palacios Contreras
//Carné: 23044
//Fecha de Creación: 04/02/2024
//Fecha de Última Modificacion: 07/02/2024

//Hoja de Trabajo 3 - Sorts

import java.util.Arrays;

/**
 * Clase que implementa el algoritmo de Gnome Sort para ordenar un array de elementos comparables.
 * @param <T> Tipo de elementos en el array, debe ser comparable.
 */
public class GnomeSort<T extends Comparable<T>> {

    /**
     * Método para ordenar un array utilizando el algoritmo de Gnome Sort.
     * @param array Array a ordenar.
     */
    public void sort(T[] array) {
        int index = 0;
        while (index < array.length) {
            // Si estamos al principio del array o el elemento actual es mayor o igual al anterior, avanzamos
            if (index == 0 || array[index].compareTo(array[index - 1]) >= 0) {
                index++;
            } else {
                // De lo contrario, intercambiamos los elementos y retrocedemos
                T temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
    }
}
