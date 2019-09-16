package conversion_datos;

public class conversion_datos {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		double c = 0.5;
		
		//conversión implicita,
		c = a;  //en c puedo almacenar a porque c, siendo una variable tipo doble puede almacenar más informacion que un int. 
		//conversión explicita o casting
		//a=c pero no podemos almacenar la informacion de un doble dentro de un int. 
		a = (int)c; //obblighiamo al compilador que coja la variable c y la convierta en entero 
		
		//conversion de una stringa in numero intero o en un doble
		String s = "7";
		b = Integer.parseInt(s);
		c = Double.parseDouble(s);
	}

}
