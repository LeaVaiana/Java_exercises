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

	//constructor (no me funciona el constructor)
	public Administracion(String nombre, String dni, String seccion) {
		super(nombre, dni, seccion);
		this.seccion = seccion;

	}

}
