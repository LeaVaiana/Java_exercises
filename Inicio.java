import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		//print a string
		System.out.println("Ciao Mondo");

		//print a mathematical result
		int a=5;
		int b=9;
		
		int c=a*b;
		
		System.out.println(c);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Como te llamas?");
		String name = in.nextLine();
		System.out.println("Hola "+name+" que edad tienes?");
		int edad=in.nextInt();
		System.out.println(edad);
		
		if (edad<18) {
			System.out.println("Eres menor de edad");
		}else {
			System.out.println("Puedes tomar alcohol");
			
		}
		//String bebida = in.nextLine();
		
		for(int i=1;i<=60;i++) {
			if(i%6==0) {
				System.out.println(i);
			}
		}	
	}	
}