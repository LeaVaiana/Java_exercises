

package array;

public class Array {

    
    public static void main(String[] args) {

        int[] array = new int[10];//array de 10 posiciones de tipo int

        array[3] = 5; //almacenamos el valor 5 en la cuarta posición del array

        int[][] matriz = new int[5][3]; //array multidimensional de 5 filas y 3 columnas

        matriz[2][2] = 4; //tercera fila tercera columna, si eccedems de elementos obtenemos una exception  java.lang.array
    }

}
