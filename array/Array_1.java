//1.- Crear un programa que pida 5 números al usuario. Los guarde dentro de un array y finalmente muestre cada elemento con us indice.
package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array_1 {
	 
	public static void main(String[] args) throws Exception{
        
		//enter 5 numbers
        final int Index=5;
        int num[]=new int[Index];
        //call functions
        rellenarArray(num);
        mostrarArray(num);
        
	}
	
	//fill array
    public static void rellenarArray(int lista[])throws Exception{
    	System.out.println("Introduce 5 numeros y te dirè valor e index del elemento en el array! ");
        for(int i=0;i<lista.length;i++){
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	//System.out.print("Introduce 5 numeros y te dirè valor e index del elemento en el array! ");
        	String texto = br.readLine();
        	lista[i]=Integer.parseInt(texto);
        	
        }
    }

    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
}
