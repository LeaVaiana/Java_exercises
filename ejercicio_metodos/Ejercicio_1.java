/*1.- Crear un método que pasándole dos cadenas, nos devuelva la cadena más larga. Ejemplo:

masLarga("hola","caracola") devuelve "caracola"*/


package ejercicio_metodos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio_1 {
	static public String LongestString(String s1, String s2) {
		   if(s1.length() > s2.length())
			      return s1;
			   else
			      return s2;
			}
	
	

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Insert sentence 1: ");
        String s1 = br.readLine();
        
        System.out.print("Insert sentence 2: ");
        String s2 = br.readLine();
        
       
        
        System.out.println("Longest sentence: "+ LongestString(s1,s2));

	}

}
