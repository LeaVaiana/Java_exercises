package empleado_modificadores;

public class Programm {

	public static void main(String[] args) {
			Empleado_modificadores e = new Empleado_modificadores();
			//a setter is a method that updates value of a variable
			e.setNombre("Lea");
			e.setDNI("ABCD");
			e.setSueldo(2999d);
			
			System.out.println("El nombre del empleado es " + e.getNombre() + " su DNI es " + e.getDNI() + " su salario es "+ (e.sueldoNeto()));
		}

	}


