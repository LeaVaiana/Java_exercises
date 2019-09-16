//Hacer un programa que pida la altura y la edad de un niño.
//El programa evalua si el niño puede entrar en una atracción de portaventura. 
//Puede hacerlo si:
	//1.- Tiene más de 16 años
	//2.- Mide mas de 140 centímetros



package if_ejercicio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class if_ejercicio {

	public static void main(String[] args) throws Exception{
		//creo la variable age y height
		int age;
		int height;
		//pedimos por teclado la edad y la altura al usuario, hay que añadir los imports de las dos clases
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Almacenamos la edad
		System.out.print("Que edad tiene tu niño? ");
		age = Integer.parseInt(br.readLine());
		System.out.print("Que altura tiene tu niño? ");
		height = Integer.parseInt(br.readLine());
			    
		if( age > 16 && height > 140 )
			{
		     System.out.println("Tu niño puede entrar a portaventura");
		     }
		      else
		     {
		     System.out.println("Tu niño no puede entrar");
		     }
	}

}
