package acertaNumero;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class AcertaNumero {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//clase random para generar un objecto de su clase
        Random r = new Random();
        //utilizamos el objeto r para generar numero al azar. NextInt recibe un parametro en el cual podemos poner un valor limite
        int numero = r.nextInt(100);//guardamos el numero aleatorio en una variable
        System.out.println(numero);
        
        String respuesta="";//definisco las variables respuesta y n fuera del bucle
        int n;
        
        do {
            System.out.print("Escribe un número: ");
            n = Integer.parseInt(br.readLine());

            if( n == numero )
                System.out.println("Acierto");
            else
            {
                if( n > numero )
                    System.out.println("Es menor");
                else
                    System.out.println("Es mayor");

                System.out.print("¿Quieres continuar? (s|n): ");
                respuesta = br.readLine();
            }
        } while( respuesta.equals("s") && n != numero );

	}

}
