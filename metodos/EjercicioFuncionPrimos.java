package metodos;

public class EjercicioFuncionPrimos {
	

static boolean esPrimo( int n ) {//declaración de la función esPrimo que nos devuelve el numero (true) cuando es primo
        
        boolean esprimo = true; //inicializo una variable booleana true
        int i = 2;
        
        while( i<n )
        {
            if( n%i == 0 )
                esprimo = false;
                
            i++;
        }
        
        return esprimo;
	}


public static void main(String[] args) {

	    for (int i = 1; i <= 1000; i++) {
	        if( esPrimo(i) )	//si un numero en concreto i es primo lo mostraremos en pantalla
	            System.out.println(i);
	    }

	}
}
