//1.- Escribir un programa que vaya pidiendo números al usuario entre 1 y 10 y que finalice cuando el usuario introduzca el 0. Que los vaya metiendo en un arraylist y al finalizar muestre el número de elementos, la suma de todos ellos y  los números que sean pares.


package array_list;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Array_list_10 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//creo un nuevo arrayList
		ArrayList<Integer> numeros =new ArrayList<Integer>();
		//definir las variables usadas
		int numero;
		int sum=0;
		
	//DO WHILE
		do {
			System.out.println("Enter a number between 1 -10, to stop loop enter 0:");
			numero = Integer.parseInt(br.readLine());
			//empezar por la condicion mas restrictiva
			if (numero==0) {
				System.out.print("Out of loop \n");
				break;
			} else if ((numero>0)&&(numero<=10)) {
				numeros.add(numero);	
				sum=sum+numero;
			} else {
					System.out.print("Number between 1 -10");			
					}
		} while( numero != 0);
	
		
		//Imprimir los numeros
		System.out.println("Numbers entered: ");
		for (int i : numeros) {
			System.out.print(i + "\n");
		}
		
		//metodo .toString para recorrer el array y toSize para numeros de elementos
				System.out.println("Arraylist: " + numeros.toString()); 
				System.out.println("Elements number: "+ numeros.size());
		//Llamo la variable sum
				System.out.println("Sum: "+sum);
		//Numeros pares
				System.out.println("Even numbers:");
						for (int i : numeros) {
							if (i%2==0)
							System.out.println(i);
						}
	}
	
}
