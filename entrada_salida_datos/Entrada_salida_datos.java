package entrada_salida_datos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Entrada_salida_datos {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        
        System.out.println("La variable s vale: "+s);

	}

}

