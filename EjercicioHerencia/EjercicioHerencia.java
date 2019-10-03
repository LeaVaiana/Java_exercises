package ejercicioHerencia;
//c        import java.util.scanner;

public class EjercicioHerencia {

	public static void main(String[] args) {
		Empleado e = new Empleado("Lea", "fgfg");
		Administracion a = new Administracion("Gigi","abcd","marketing");
		//Gerente g = new Gerente ();
		
		//e.setNombre("Lea");
		//e.setDNI("ABCD");
		//e.setSueldo(2999d);
		//a.Administracion("obrero");
		
		System.out.println("El nombre del empleado es " + e.getNombre() + " su DNI es " + e.getDNI() + " su salario es "+ (e.getSueldo() * 0.85));
		System.out.println("El nombre del empleado es " + e.getNombre() + " su DNI es " + e.getDNI() + " su salario es "+ (Empleado.sueldoNeto()));
		//System.out.println("El nombre del empleado es " + e.nombre + " su DNI es " + e.DNI + ". El empleado es un " + a.seccion);
        //System.out.println("El nombre del empleado es " + e.getNombre() + " su DNI es " + e.getDNI() + " su salario es "+ (e.sueldoNeto()));
        //System.out.println("El sueldo del gerente es " + g.sueldoNeto());
		//System.out.println(a.seccion);
		
	}

}
