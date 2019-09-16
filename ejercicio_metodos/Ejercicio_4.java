/*Crear un método que pasándole una letra y una cadena nos diga cuantas veces aparece esa letra en la cadena.
("a","caracola") devuelve 3*/

package ejercicio_metodos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio_4 {
	static public int countLetters(String text, String letter) {
		int counter = 0;
        for (int i = 0; i < text.length(); i++) {
        	if (text.charAt(i) == letter.charAt(0)) {	
            counter++;
        }    
	}
    return counter;
}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Insert a sentence: ");
        String text = br.readLine();
        
        System.out.print("Insert a letter: ");
        String letter = br.readLine();
        
        System.out.println("Number times of letter in the string: "+ countLetters(text,letter));

	}

}
