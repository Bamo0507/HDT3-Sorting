import java.util.Arrays;

public class CycleSort {

    public static <T extends Comparable<T>> void sort(T[] arr) {
        int n = arr.length;

        for (int inicio = 0; inicio < n - 1; inicio++) {
            T actual = arr[inicio];
            int posicion = inicio;

            // Encuentra la posición donde se debe colocar el elemento
            for (int i = inicio + 1; i < n; i++) {
                if (arr[i].compareTo(actual) < 0) {
                    posicion++;
                }
            }

            // Si el elemento ya está en la posición correcta
            if (posicion == inicio) {
                continue;
            }

            // De lo contrario, coloca el elemento en la posición correcta
            while (actual.equals(arr[posicion])) {
                posicion++;
            }

            T temp = arr[posicion];
            arr[posicion] = actual;
            actual = temp;

            // Rota el ciclo
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
