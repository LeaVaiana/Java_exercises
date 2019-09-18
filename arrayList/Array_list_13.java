//Escribir un programa que nos pida una frase, guarde las palabras en un arraylist y nos diga cuantas palabras hay y cual es la más larga.


package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list_13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
	//Variables
		int num_words;
		int long_max=0;
		String lunga="";
		int longWord;
	
	//ask to user
		System.out.println("Enter a sentence: ");
		String stringToSplit = s.nextLine();
		
	//Metodo split para obtener las palabras
		// String to split
        String[] wordArray;
        // delimiter
        String delimiter = " ";
        // substring
        wordArray = stringToSplit.split(delimiter);
        
        //print substrings */
        System.out.println("Substrings are: ");
        for (int i = 0; i < wordArray.length; i++)
            System.out.println(wordArray[i]);
        
     //new arrayList for substring
        ArrayList<String> listSubstring= new ArrayList<String>();
        
		
		for (String substring : wordArray) { 
			listSubstring.add(substring);       //add substring to arrayList listSubstring	
			
			longWord=substring.length(); //longest word
			if (longWord > long_max) {
				long_max = longWord;
				lunga=substring;
			}
			
		}		
		num_words=listSubstring.size(); // number of words in the arrayList
		System.out.println("Numbers of words "+num_words);
		
		System.out.println("Longest word: "+lunga);
	}

}


