package ejercicios;

public class EjercicioRestaurante2 {
	
	
	public double cantidadPapas;
	public double cantidadChocos;
	
	public EjercicioRestaurante2(double papas, double chocos) {
		this.cantidadPapas = papas;
		this.cantidadChocos = chocos;
		
		
	}
	
	public void addPapas(int x) {
		this.cantidadPapas += x;
	}
	
	public void addChocos(int x) {
		this.cantidadChocos += x;
	}
	
	
	public  int getComensales(double papas, double chocos) {
		int minPapas = 1;
				double minChocos = 0.5;
				if(papas < minPapas || chocos < minChocos) {
					return 0;
				}
		
		int clientes = 3;
		 double cantidadPapas = (papas * clientes)/minPapas;
		 double cantidadChocos = (chocos * clientes)/minChocos;
		double resultado = Math.min(cantidadPapas, cantidadChocos);
		return (int) resultado;
		
	}
	
	public void showChocos() {
		System.out.println("Cantidad de chocos en almacen: " + cantidadChocos );
	}
	
	public void showPapas() {
		System.out.println("Cantidad de papas en almacen: " + cantidadPapas );
	}
	
	

}
