package aprobado_suspendido;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Aprobado_suspendido {
	public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe la nota que has obtenido: ");
        int nota = Integer.parseInt(br.readLine());
        
        if( nota >=0 && nota <= 10 )
        {
            // Nota correcta
            switch(nota) {
                case 5:
                    System.out.println("Aprobado");
                    break;
                case 6:
                    System.out.println("Bien");
                    break;
                case 7:
                    System.out.println("Mejor");
                    break;
                case 8:
                    System.out.println("Notable");
                    break;
                case 9:
                    System.out.println("Sobresaliente");
                    break;
                case 10:
                    System.out.println("¡¡Perfecto!!");
                    break;
                default:
                    System.out.println("Suspendido, tienes que estudiar!!!");
                    break;
            }
        }
        else
            System.out.println("ERROR: El valor es incorrecto.");

    }
}
