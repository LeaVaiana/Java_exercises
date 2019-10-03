package ejercicioHerencia;


	
	public class Empleado {
		//propiedad protected ara acceder desde otra clase
		protected String nombre;
		protected String dni;
	    protected static double sueldo;
	    //double sueldoNeto;
	    
	    
	 
		
		//GETTERS AND SETTERS para poderlos modificar desde el exterior
		
		
		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getDni() {
			return dni;
		}


		public void setDni(String dni) {
			this.dni = dni;
		}


		public static double getSueldo() {
			return sueldo;
		}


		public static void setSueldo(double sueldo) {
			Empleado.sueldo = sueldo;
		}


		/*public double getSueldoNeto() {
			return sueldoNeto;
		}


		public void setSueldoNeto(double sueldoNeto) {
			this.sueldoNeto = sueldoNeto;
		}*/


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
		public Empleado(String nombre, String dni) {
			super();
			this.nombre = nombre;
			this.dni = dni;
		}
	}

