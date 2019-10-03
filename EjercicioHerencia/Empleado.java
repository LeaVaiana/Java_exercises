package ejercicioHerencia;


	
	public class Empleado {
		//propiedad protected ara acceder desde otra clase
		protected String nombre;
		protected String DNI;
	    protected static double sueldo;
	    double sueldoNeto;
	    
	    
	 
		
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
	
		
		public Empleado(String nombre, String DNI) {
			
			this.nombre = nombre;
			this.DNI = getDNI();
		}
		
		
		/*public Empleado() {
			nombre = "Gigi";
			DNI = "efgh";
		}*/
	}

