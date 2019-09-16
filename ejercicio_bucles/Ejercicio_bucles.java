/*1.- Escribir un programa que pida un número al usuario entre 1 y 10. 
Si el usuario introduce un número que no esté en el rango, debe volver a pedirlo (Bucle do while)*/

/*2.- Escribir un programa que nos pida una cadena y nos diga cuantas veces aparece la letra "a" (bucle while, string indexof)*/

/*3.- Escribir un programa que nos pida un número mayor de 1 y que nos diga la suma de todos los números hasta el número introducido. 
 Por ejemplo, si introduce el 4: 1+2+3+4=10*/


package ejercicio_bucles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio_bucles {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//1 DO WHILE
		int numero;
	
        do
        {
            System.out.println("Introduce un numero entre 1 y 10: ");
            numero = Integer.parseInt(br.readLine());

        } while( numero > 10);
        
        
      //2 WHILE IndexOf
        System.out.print("Escribe una sentencia y te dirè cuantas veces se repite la letra a: ");//para mostrar el mensaje en pantalla
        String cadena = br.readLine(); //almacenamos la respuesta en una variable
        int posicion, contador =0;
        String caracter="a";
        posicion = cadena.indexOf(caracter); 
        
        //System.out.print(posicion);
       
        while (posicion != -1){//mientras se encuentre el caracter
        	contador++;           //se cuenta
        	//se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        System.out.println(contador);
        
        
        
        //3 Escribir un programa que nos pida un número mayor de 1 y que nos diga la suma de todos los números hasta el número introducido. 
        //Por ejemplo, si introduce el 4: 1+2+3+4=10*/
        
        System.out.println("Escribe un número positivo: ");
        int n = Integer.parseInt(br.readLine());
        
        //bucle para comprobar que el usuario escriba un numero positivo
        while( n < 0 )
        {
            System.out.println("ERROR: El número no es positivo.");

            System.out.print("Escribe un número positivo: ");
            n = Integer.parseInt(br.readLine());
        }
        
      //calcular la somma con el bucle for
        int somma = 0; //la variable se inicializa a zero
        
        for (int i = 1; i <= n; i++) {
            somma += i;
        }

        System.out.println("Suma de numeros hasta "+n+": "+somma);
        
	}
}
