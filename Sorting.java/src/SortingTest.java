import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SortingTest {
    
    @Test
    public void testGnomeSort() {
        int[] arr = {5, 2, 7, 1, 3};
        int[] expected = {1, 2, 3, 5, 7};
        GnomeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSort() {
        int[] arr = {5, 2, 7, 1, 3};
        int[] expected = {1, 2, 3, 5, 7};
        GnomeSort(arr);
        assertArrayEquals(expected, arr);
    }

    //Método para hacer MergeSort
    public static void MergeSort(int[] listadoNumeros){
        if (listadoNumeros.length > 1) {
            int medio = listadoNumeros.length / 2;
            int[] izquierda = new int[medio];
            int[] derecha = new int[listadoNumeros.length - medio];

            // Copiar elementos a los subarrays izquierda y derecha
            for (int i = 0; i < medio; i++) {
                izquierda[i] = listadoNumeros[i];
            }
            for (int i = medio; i < listadoNumeros.length; i++) {
                derecha[i - medio] = listadoNumeros[i];
            }

            // Llamadas recursivas para ordenar las dos mitades
            MergeSort(izquierda);
            MergeSort(derecha);

            // Combinar las dos mitades ordenadas
            int i = 0, j = 0, k = 0;
            while (i < izquierda.length && j < derecha.length) {
                if (izquierda[i] < derecha[j]) {
                    listadoNumeros[k] = izquierda[i];
                    i++;
                } else {
                    listadoNumeros[k] = derecha[j];
                    j++;
                }
                k++;
            }

            // Agregar elementos restantes de izquierda
            while (i < izquierda.length) {
                listadoNumeros[k] = izquierda[i];
                i++;
                k++;
            }

            // Agregar elementos restantes de derecha
            while (j < derecha.length) {
                listadoNumeros[k] = derecha[j];
                j++;
                k++;
            }
        }
    }

    //Método para hacer el GnomeSort
    public static void GnomeSort(int[] listadoNumeros){
        int index = 0;
        while (index < listadoNumeros.length) {
            if (index == 0) {
                index++;
            }
            if (listadoNumeros[index] >= listadoNumeros[index - 1]) {
                index++;
            } else {
                int temp = listadoNumeros[index];
                listadoNumeros[index] = listadoNumeros[index - 1];
                listadoNumeros[index - 1] = temp;
                index--;
            }
        }
    }

}

