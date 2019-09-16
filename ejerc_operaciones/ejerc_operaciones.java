//Mostrar en pantalla todas las posibles operaciones entre dos numeros enteros, dos reales, y entero real
package ejerc_operaciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejerc_operaciones {

	public static void main(String[] args) throws Exception {
		//creo dos variables enteras
		int a, b;
		//creo dos variables reales de tipo doble
        double x, y;
        
        //pedimos por teclado los datos al usuario, hay que añadir los imports de las dos clases
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Almacenamos los 4 valores pidiendolos al usuario (readLine nos devuelve un string así que es necesario realizar la conversion):
        System.out.print("Escribe un número entero: ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Escribe un número entero: ");
        b = Integer.parseInt(br.readLine());
        System.out.print("Escribe un número real: ");
        x = Double.parseDouble(br.readLine());
        System.out.print("Escribe un número real: ");
        y = Double.parseDouble(br.readLine());

        //OPERACIONES NUMEROS ENTEROS
        System.out.println("ENTEROS");
        System.out.println("a+b = "+(a+b));
        System.out.println("a-b = "+(a-b));
        System.out.println("b-a = "+(b-a));
        System.out.println("a*b = "+(a*b));
        System.out.println("a/b = "+(a/b));
        System.out.println("b/a = "+(b/a));
        System.out.println("a%b = "+(a%b));
        System.out.println("b%a = "+(b%a));
        
        //OPERACIONES NUMEROS REALES
        System.out.println("REALES");
        System.out.println("x+y = "+(x+y));
        System.out.println("x-y = "+(x-y));
        System.out.println("y-x = "+(y-x));
        System.out.println("x*y = "+(x*y));
        System.out.println("x/y = "+(x/y));
        System.out.println("y/x = "+(y/x));
        System.out.println("x%y = "+(x%y));
        System.out.println("y%x = "+(y%x));

      //OPERACIONES ENTEROS REALES
        System.out.println("ENTERO Y REAL");
        System.out.println("a+y = "+(a+y));
        System.out.println("a-y = "+(a-y));
        System.out.println("y-a = "+(y-a));
        System.out.println("a*y = "+(a*y));
        System.out.println("a/y = "+(a/y));
        System.out.println("y/a = "+(y/a));
        System.out.println("a%y = "+(a%y));
        System.out.println("y%a = "+(y%a));
        
	}

}
