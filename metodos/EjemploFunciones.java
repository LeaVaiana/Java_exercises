package metodos;

public class EjemploFunciones {

	//DECLARACIÓN DE LA FUNCIÓN
    static int multiplicaPorTres( int p ) {//recibe un parametro que se llama p de tipo int)
            int r = p * 3;//valor de retorno
            return r;//devuelve al programa principal el valor de r
    }
    //LLAMADA
    public static void main(String[] args) {
            int a = 5;
            int b = multiplicaPorTres(a);

            System.out.println(b);
    }

}
