//Pedir número enteros y preguntar si queremos añadir más
//Cuando conteste que no, mostraremos la suma de los numeros añadidos

package sumarNumeros;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumarNumeros {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("¿Quieres añadir un numero? (s|n): ");//para mostrar el mensaje en pantalla
        String respuesta = br.readLine(); //almacenamos la respuesta en una variable
        
        int total=0;
        
        while(respuesta.equals("s"))
        {
            // Pedir números
            System.out.print("Introduce un número: ");
            int numero = Integer.parseInt(br.readLine());
            
            total = total + numero;

            System.out.print("¿Quieres seguir sumando números? (s|n): ");
            respuesta = br.readLine();
        }

        System.out.println("Resultado: "+total);
	}

}
