package ejercicioHerencia;

public class Direccion extends Empleado {
	
	//nueva propiedad de direccion
		protected int StockOptions;

		//getter setter
		public int getStockOptions() {
			return StockOptions;
		}

		public void setStockOptions(int stockOptions) {
			StockOptions = stockOptions;
		}

		//CONSTRUCTOR

		public Direccion(String nombre, String DNI, int StockOptions) {
			super(nombre, DNI);
			this.StockOptions = StockOptions;

		}


		//Metodo sueldoNeto modificado llamando a la función sueldoNeto de la clase madre y sumándole las StockOption multiplicadas por 0.1
		public double sueldoNeto() {

			return super.sueldoNeto() + (this.getStockOptions()*0.1);
		}


	}



