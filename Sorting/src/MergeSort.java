import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> {

    public void sort(T[] array) {
        mergeSort(array);
    }

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

        while (i < izquierda.length) {
            array[k] = izquierda[i];
            i++;
            k++;
        }

        while (j < derecha.length) {
            array[k] = derecha[j];
            j++;
            k++;
        }
    }
}
