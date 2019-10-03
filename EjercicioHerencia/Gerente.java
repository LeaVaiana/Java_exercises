package ejercicioHerencia;

public class Gerente extends Empleado{
	//nuevas propiedades de Gerente
		String departamento;
		static int dietas;

		//getters & setters
		public String getDepartamento() {
			return departamento;
		}
		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}
		public int getDietas() {
			return dietas;
		}
		public void setDietas(int dietas) {
			this.dietas = dietas;
		}
		//Metodo sueldoNeto modificado llamando a la función sueldoNeto de la clase madre y sumándole las dietas
				public double sueldoNeto() {

					return super.sueldoNeto() + this.getDietas();
				}
	
}
