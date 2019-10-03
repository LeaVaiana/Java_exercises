package ejercicioHerencia;
//c        import java.util.scanner;

public class EjercicioHerencia {

	public static void main(String[] args) {
		//Creo un empleado
		Empleado e = new Empleado(null, null);
		Administracion a = new Administracion(null, null, null);
		//Gerente g = new Gerente ();
		
		//Añado valor atributos al empleado
		e.setNombre("Lea");
		e.setDni("ABCD");
		e.setSueldo(3001d);
		//Añado valor atributos a administracion
		a.setNombre("pepino");
		a.setDni("lllll");
		a.setSeccion("Marketing");
		
		
		System.out.println("El nombre del empleado 1 es " + e.getNombre() + " su DNI es " + e.getDni() + " su salario es "+ (e.getSueldo() * 0.85));
		System.out.println("El nombre del empleado 1 es " + e.getNombre() + " su DNI es " + e.getDni() + " su salario es "+ (Empleado.sueldoNeto()));
		System.out.println("El nombre del empleado 2 es " + a.getNombre() + " su DNI es " + a.getDni() + " su departamento es "+ a.getSeccion());
		//System.out.println("El nombre del empleado es " + e.nombre + " su DNI es " + e.DNI + ". El empleado es un " + a.seccion);
        //System.out.println("El nombre del empleado es " + e.getNombre() + " su DNI es " + e.getDNI() + " su salario es "+ (e.sueldoNeto()));
        //System.out.println("El sueldo del gerente es " + g.sueldoNeto());
		//System.out.println(a.seccion);
		
	}

}
