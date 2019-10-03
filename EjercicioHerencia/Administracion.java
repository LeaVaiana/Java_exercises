package ejercicioHerencia;

public class Administracion extends Empleado{
	

	//nueva propiedad de administracion
	String seccion;

	//getter setters
	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	//constructor
	public Administracion(String nombre, String DNI, String seccion) {
		super(nombre, DNI, seccion);
		this.seccion = seccion;

	}

}
