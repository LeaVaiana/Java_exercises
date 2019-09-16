//Escribir un programa que pida dos números, los almacene en dos variables y nos muestre la suma y la multiplicación de los mismos.

package variables;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class variables {

	public static void main(String[] args) throws Exception{
		//creo dos variables enteras
		int a, b;
		//pedimos por teclado los dos numeros al usuario, hay que añadir los imports de las dos clases
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    //Almacenamos los 2 valores
	    System.out.print("Escribe un número entero: ");
	    a = Integer.parseInt(br.readLine());
	    System.out.print("Escribe otro número entero: ");
	    b = Integer.parseInt(br.readLine());
	    
	  //OPERACIONES NUMEROS ENTEROS
        System.out.println("Te muestro la suma y la moltiplicación de los dos numeros:");
        System.out.println("a+b = "+(a+b));
        System.out.println("a*b = "+(a*b));

	}

}

