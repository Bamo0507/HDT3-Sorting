import static org.junit.Assert.assertArrayEquals;
import java.util.Arrays;
import org.junit.Test;

public class SortingTest {

    @Test
    public void testCycleSort() {
        CycleSort Csort = new CycleSort();
        // Caso de prueba con arreglo desordenado
        Integer[] arr1 = {4, 2, 1, 3, 5};
        Csort.sort(arr1);
        Integer[] expected1 = {1, 2, 3, 4, 5};
        assertArrayEquals(expected1, arr1);
    }

    @Test
    public void testRadixSort() {
        Integer[] arregloDesordenado = {170, 45, 75, 90, 802, 24, 2, 66};
        Integer[] arregloOrdenado = {2, 24, 45, 66, 75, 90, 170, 802};
        
        RadixSort.radixSort(arregloDesordenado);
        
        assertArrayEquals(arregloOrdenado, arregloDesordenado);
    }

    @Test
    public void testQuickSort() {
        Integer[] arregloDesordenado = {4, 2, 8, 1, 5, 6, 3, 7};
        Integer[] arregloOrdenado = {1, 2, 3, 4, 5, 6, 7, 8};
        
        QuickSort.sort(arregloDesordenado);
        
        assertArrayEquals(arregloOrdenado, arregloDesordenado);
    }

    @Test
    public void testGnomeSort() {
        GnomeSort gnomeSort = new GnomeSort();
        Integer[] arregloDesordenado = {3, 2, 9, 1, 5, 6, 3, 8};
        Integer[] arregloOrdenado = {1, 2, 3, 3, 5, 6, 8, 9};
        gnomeSort.sort(arregloDesordenado);
        assertArrayEquals(arregloOrdenado, arregloDesordenado);
    }

    @Test
    public void testMergeSort() {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        
        // Caso de prueba con arreglo desordenado
        Integer[] arr1 = {4, 2, 1, 3, 5};
        mergeSort.sort(arr1);
        Integer[] expected1 = {1, 2, 3, 4, 5};
        assertArrayEquals(expected1, arr1);
    }
}