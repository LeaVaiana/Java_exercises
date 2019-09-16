package string_method;


public class indexOf_2 {   
    public static void main(String args[]) {        
  
        String str_Sample = "Este es el índice del ejemplo";   
  
        // Carácter en la posición -1, no se encuentra en la stringa   
        System.out.println("Índice de caracteres 'x':" + str_Sample.indexOf('x'));      
  
        // Index del caracter indicado a partir del index dado  
        System.out.println("Índice de caracteres 'después del índice 3:" + str_Sample.indexOf('s', 3));   
  
        // Index de la subcadena dada      
        System.out.println("Índice de subcadena 'es':" + str_Sample.indexOf("es"));     
  
        // Index de la subcadena dada a partir del index indicado  
        System.out.println("Índice de subcadena 'es' despues del index 4" + str_Sample.indexOf("es", 4));   
    }
}
