//Bryan Alberto Martínez Orellana 23542
//Adriana Sophia Palacios Contreras 23044
//Fecha de Creación: 04/02/2024
//Fecha de Última Modificacion: 
//Hoja de Trabajo 3 - Sorts

//Librerías a utilizar
import java.util.Random;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sorting {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //Mensaje de bienvenida y se generan los números al azar
        System.out.println("************ BIENVENIDO ************"); 
        System.out.println("A continuación estaremos probando diferentes algoritmos para ordenar números!!!");   
        int[] numerosGeneradosViejos = generar3000Nums();
        int[] numerosGnome = numerosGeneradosViejos;
        int[] numerosMerge = numerosGeneradosViejos;
        int[] numerosQuick = numerosGeneradosViejos;
        int[] numerosRadix = numerosGeneradosViejos;
        int[] numerosCycle = numerosGeneradosViejos;
        //Se guardan los números en el CSV
        guardarEnArchivo("ListaNumeros.csv", numerosGeneradosViejos);
        System.out.println("-----------------------------------------");
        System.out.println("Números generados previos a ordenar: \n");
        imprimirArray(numerosGeneradosViejos);
        System.out.println("-----------------------------------------");

        //Hacemos el GnomeSort
        System.out.println("!!!!!!!!!!!!!!! Se hará el GnomeSort !!!!!!!!!!!!!!!!");
        GnomeSort(numerosGnome);
        System.out.println("Números después de ordenar: \n");
        imprimirArray(numerosGnome);

        System.out.println("-----------------------------------------");

        //Hacemos el MergeSort
        System.out.println("!!!!!!!!!!!!!!! Se hará el MergeSort !!!!!!!!!!!!!!!!");
        MergeSort(numerosMerge);
        System.out.println("Números después de ordenar: \n");
        imprimirArray(numerosGnome);

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
    
    /** 
     * @return int[]
     */
    //Método para generar 3000 números random
    public static int[] generar3000Nums(){
        Random rand = new Random();
        //Se crea el Array donde se guardarán los valores
        int[] listaNumeros = new int[3000];
        //Se entra en un ciclo hasta que se guarden 3000 números al azar en un Array
        for(int i=0; i<listaNumeros.length; i++){
            int numRandom = rand.nextInt(3001);
            listaNumeros[i] = numRandom;
        }
        //Se devuelve la lista
        return listaNumeros;
    }

    
    /** 
     * @param nombreArchivo
     * @param listadoNumeros
     */
    //Método para guardar los números de un Array en un archivo CSV
    public static void guardarEnArchivo(String nombreArchivo, int[] listadoNumeros){
        String nombre = nombreArchivo;
        try{
            //Eliminar valores actuales del CSV
            File archivoCSV = new File(nombre);
            if(archivoCSV.exists()){
                archivoCSV.delete();
            }
            //Buffer para escribir sobre el CSV
            BufferedWriter w = new BufferedWriter(new FileWriter(nombre));
            //Se hace un ciclo hasta colocar todos los números que se tengan
            for(int i=0; i<listadoNumeros.length; i++){
                w.write(Integer.toString(listadoNumeros[i]));
                //Si no estamos al final de la lista, agregar coma
                //Esto para manetener el formato de CSV
                if(i < listadoNumeros.length - 1){
                    w.write(",");
                }
            }
            w.close();
        } catch (IOException e){
            System.out.println("Por favor, verifique el nombre del archivo proporcionado o el tipo de valores que guarda su Array.");
        }
    }

    public static void imprimirArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
