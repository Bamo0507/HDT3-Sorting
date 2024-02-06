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
        GnomeSort gnomeSort = new GnomeSort();
        MergeSort mergeSort = new MergeSort();
        //Mensaje de bienvenida y se generan los números al azar
        for(int i=10; i < 3000; i++){
            gnomeSort.sort(generarOrdenados(i));
        }
    }
    
    public static Integer[] generarRandoms(int cantidad) {
        Random random = new Random();
        Integer[] numerosAleatorios = new Integer[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numerosAleatorios[i] = random.nextInt(3000) + 1; // Números aleatorios entre 1 y 3000
        }
        return numerosAleatorios;
    }


    public static Integer[] generarOrdenados(int cantidad) {
        Integer[] numerosOrdenados = new Integer[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numerosOrdenados[i] = i + 1; // Comienza desde 1 y aumenta en cada iteración
        }
        return numerosOrdenados;
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
