package for_loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un número positivo: ");
        int n = Integer.parseInt(br.readLine());
        
        //bucle para comprobar que el usuario escriba un numero positivo
        while( n < 0 )
        {
            System.out.println("ERROR: El número no es positivo.");

            System.out.print("Escribe un número: ");
            n = Integer.parseInt(br.readLine());
        }
        
        //calcular el factorial con el bucle for
        int factorial = 1; //la variable se inicializa a 1 y no a zero, si no obtendriamos siempre 0
        
        for (int i = 1; i <= n; i++) {
            //factorial = factorial * i;
            factorial *= i;
        	
        }

        System.out.println("Factorial de "+n+": "+factorial);
        
      
        
    }
}
