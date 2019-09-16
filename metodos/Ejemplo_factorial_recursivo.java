package metodos;

public class Ejemplo_factorial_recursivo {

    static int factorial(int n) {
        if( n == 0 )//CASO BASE, 0!=1
            return 1;
        else
            return n*factorial(n-1);//CASO GENERAL DE FACTORIAL 5*4!; 5*4*3!; 5*4*3*2!...
    }

    public static void main(String[] args) {

        System.out.println( factorial(6) );
    }

}
