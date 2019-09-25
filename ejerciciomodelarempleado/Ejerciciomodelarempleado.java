package ejerciciomodelarempleado;

public class Ejerciciomodelarempleado {

	public static void main(String[] args) {
		Empleado e = new Empleado();
		e.setNombre("Lea");
		e.setDNI("ABCD");
		e.setSueldo(200d);
		
		//System.out.println("El nombre del empleado es " + e.getNombre() + " su DNI es " + e.getDNI() + " su salario es "+ (e.getSueldo() * 0.85));
        System.out.println("El nombre del empleado es " + e.getNombre() + " su DNI es " + e.getDNI() + " su salario es "+ (Empleado.sueldoNeto()));
	}
}
