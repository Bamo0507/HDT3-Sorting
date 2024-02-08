//Bryan Alberto Martínez Orellana 23542
//Adriana Sophia Palacios Contreras 23044
//Fecha de Creación: 04/02/2024
//Fecha de Última Modificacion:
//Hoja de Trabajo 3 - Sorts

//Librerías a utilizar
import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        GnomeSort gnomeSort = new GnomeSort();
        Integer[] numeros = leerCSV();
        System.out.println("Press key");
        Scanner scan = new Scanner(System.in);
        String tecla = scan.nextLine();
        System.out.println("Bienvenido Querido Usuario!!!");
        for(int i=10; i < 3000; i++){
            Integer[] numerosActuales = Arrays.copyOf(numeros, i);
            gnomeSort.sort(generarOrdenados(i)); 
            System.out.println("Iteration " + i );
        }
        System.out.println("Done...");
    }

    public static Integer[] generarRandoms(int cantidad) {
        Random random = new Random();
        Integer[] numerosAleatorios = new Integer[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numerosAleatorios[i] = random.nextInt(3000) + 1; // Números aleatorios entre 1 y 3000
        }
        return numerosAleatorios;
    }

    public static Integer[] leerCSV() throws IOException {
        Integer[] numeros = new Integer[3000];

        String archivoCSV = "ListaNumeros.csv"; // Nombre del archivo

        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea = br.readLine(); // Lee la primera línea del archivo
            if (linea != null) {
                String[] valores = linea.split(","); // Divide la línea en valores individuales
                for (int i = 0; i < Math.min(valores.length, 3000); i++) {
                    numeros[i] = Integer.parseInt(valores[i].trim());
                }
            }
        }

        return numeros;
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
