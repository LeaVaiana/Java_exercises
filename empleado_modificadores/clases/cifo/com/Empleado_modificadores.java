//En el proyecto donde hayas creado la clase empleado crea un proyecto llamado: clases.cifo.com
//Arrastra ahí la clase empleado y añade una clase program con main para poder usar y probar la clase empleado.

package clases.cifo.com;

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
	
	//añado una clase program con main
	public static void main(String[] args) {
		Empleado_modificadores e = new Empleado_modificadores();
		//a setter is a method that updates value of a variable
		e.setNombre("Lea");
		e.setDNI("ABCD");
		e.setSueldo(2999d);
		
		System.out.println("El nombre del empleado es " + e.getNombre() + " su DNI es " + e.getDNI() + " su salario es "+ (e.sueldoNeto()));
	}
}
