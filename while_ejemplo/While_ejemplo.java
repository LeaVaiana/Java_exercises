package while_ejemplo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class While_ejemplo {

	public static void main(String[] args) throws Exception {
		//leemos por teclado
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("¿Quieres que repita? (s|n): ");//para mostrar el mensaje en pantalla
        String respuesta = br.readLine(); //almacenamos la respuesta en una variable
        
        
        //BUCLE WHILE
        while( respuesta.equals("s") )
        {
            System.out.println("Repitiendo!!");

            System.out.print("¿Quieres que repita? (s|n): ");
            respuesta = br.readLine();
        }
        
        //BUCLE DO WHILE
        int vuelta = 0;//inicializar una variable a 0
        
        do
        {
            vuelta++;
            System.out.println("Vuelta número: "+vuelta);
            
            System.out.print("¿Quieres que repita? (s|n): ");
            respuesta = br.readLine();

        } while( respuesta.equals("s") );//la condición al final del bucle
        
	}

}
