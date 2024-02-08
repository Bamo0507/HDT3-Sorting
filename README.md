# HDT3-Sorting
# Repositorio de Algoritmos de Ordenamiento

Este repositorio contiene implementaciones en Java de varios algoritmos de ordenamiento. Los algoritmos cubiertos en este repositorio incluyen:

- **Cycle Sort**
- **Radix Sort**
- **Quick Sort**
- **Gnome Sort**
- **Merge Sort**

## Tabla de Contenidos

- [Introducción](#introducción)
- [Algoritmos](#algoritmos)
  - [Cycle Sort](#cycle-sort)
  - [Radix Sort](#radix-sort)
  - [Quick Sort](#quick-sort)
  - [Gnome Sort](#gnome-sort)
  - [Merge Sort](#merge-sort)
- [Uso](#uso)
- [Pruebas](#pruebas)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)

## Introducción

Los algoritmos de ordenamiento son esenciales en ciencias de la computación y procesamiento de datos. Este repositorio proporciona implementaciones en Java de algoritmos de ordenamiento populares, cada uno implementado en una clase separada.

## Algoritmos

### Cycle Sort

Cycle Sort es un algoritmo de ordenamiento in situ e inestable conocido por su complejidad óptima cuando las escrituras en la memoria son costosas.

### Radix Sort

Radix Sort es un algoritmo de ordenamiento de enteros no comparativo que ordena datos con claves de enteros agrupando las claves por dígitos individuales.

### Quick Sort

Quick Sort es un algoritmo de ordenamiento comparativo y es uno de los algoritmos de ordenamiento más utilizados. Emplea una estrategia de dividir y conquistar para una ordenación eficiente.

### Gnome Sort

Gnome Sort es un algoritmo de ordenamiento simple que funciona intercambiando repetidamente elementos adyacentes si están en el orden incorrecto.

### Merge Sort

Merge Sort es un popular algoritmo de ordenamiento que utiliza la estrategia de dividir y conquistar para ordenar un array. Divide el array en dos mitades, las ordena y luego fusiona las mitades ordenadas.

## Uso

Para utilizar los algoritmos de ordenamiento, simplemente instancia la clase del algoritmo deseado y llama al método `sort` con tu array.

## Pruebas

El repositorio incluye una clase de prueba JUnit (`SortingTest`) que verifica la corrección de cada algoritmo de ordenamiento.

## Profiler Utilizado

Para esta hoja de trabajo se estuvo utilizando el profiler de JProfiler, este permite al usuario conocer cómo se maneja la memoria y los tiempos que le toma al procesador ejecutar diferentes instrucciones, entre otra vastedad de opciones. Este profiler tiene la ventaja que no depende de utilizar un IDE específico, sino que solamente se necesita tener un folder con los archivos .Class. Para poder utilizarlo se colocaba el working space como el folder con los archivos Class, y se indicaba el nombre del main. A continuación, se tenía que dirigir al apartado de CPU Memory, aquí se seleccionaba la opción de Complexity Analysis, se elegía el método que se deseaba estudiar, y posteriormente se exportaban los datos. Cada exportación fue colocada en una columna de un documento aparte, de esta manera se mantenía registro de cada uno de los tiempos que le tomó a los sorts finalizar su tarea, teniendo datos tanto ordenados como desordenados. Para la complejidad, se obtuvo que el quick, merge, y cycle sort tenían complejidad logarítmica, el gnome sort cuadrática, y el radix sort, lineal. El gráfico obtenido se colocó en el inciso “a”.
