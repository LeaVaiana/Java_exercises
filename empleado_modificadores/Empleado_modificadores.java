//Añadir un método privado getIRPF que devuelva 0.85 si el sueldo es menor de 3000 y 0.75 en caso contrario. Modificar el método sueldoNeto para que multiplique por getIRPF en vez de por 0.85

package empleado_modificadores;

public class Empleado_modificadores {
	//Since variables are private, code from outside this class cannot access the variable directly
	private String nombre;
	private String DNI;
    private static double sueldo;
    //private double sueldoNeto;
    
  //GETTERS AND SETTERS the outside code have to invoke the getter and the setter in order to read or update the variable
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public static double getSueldo() {
		return sueldo;
	}

	public static void setSueldo(double sueldo) {
		Empleado_modificadores.sueldo = sueldo;
	}

	
	//METODO getIRPF y sueldoNeto
	private static double getIRPF() {
		if(sueldo >=3000) 
			return 0.75;
		else
			return 0.85;
		}



    
	public static double sueldoNeto() {
		
		//return (sueldo * 0.85);
		return (sueldo * getIRPF());
	}
	//CONSTRUCTOR
	
	/*public Empleado(String nombre, String dNI) {
		super();
		this.nombre = nombre;
		DNI = dNI;
	}*/
	
	

	public Empleado_modificadores() {
		nombre = "Gigi";
		DNI = "efgh";
	}
}
