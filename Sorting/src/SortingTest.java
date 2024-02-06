import static org.junit.Assert.assertArrayEquals;
import java.util.Arrays;
import org.junit.Test;

public class SortingTest {

    @Test
    public void testCycleSort() {
        Integer[] arregloDesordenado = {4, 2, 1, 3, 5};
        Integer[] arregloOrdenado = {1, 2, 3, 4, 5};
        
        CycleSort.sort(arregloDesordenado);
        
        assertArrayEquals(arregloOrdenado, arregloDesordenado);
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
}
//
