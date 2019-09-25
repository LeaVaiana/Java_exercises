package ejerciciomodelarempleado;

public class Empleado {
	String nombre;
    String DNI;
    private static double sueldo;


  //GETTERS AND SETTERS para poderlos modificar desde el exterior
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
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	//METODO


	public static double sueldoNeto() {

		return (sueldo * 0.85);
	}
	//CONSTRUCTOR
	
	public Empleado() {
		nombre = "Gigi";
		DNI = "efgh";
	}
}
