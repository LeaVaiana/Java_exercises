package switch_ejemplo;

public class Switch_ejemplo {

	public static void main(String[] args) {
		int a = 8;
        
        switch( a )
        {
            case 1:
                System.out.println("Este es el caso 1");
            break;
            case 2:
                System.out.println("Este es el caso 2");
            break;
            case 3:
                System.out.println("Este es el caso 3");
            break;
            default:
                System.out.println("No hay coincidencia");
            break;
        }
    }
}
