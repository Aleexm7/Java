package ejercicios;

public class EjercicioRestaurante {

	
	public double CantidadPapas;
	public double CantidadChocos;
	
	
	
	
	public static int getComensales(double papas, double chocos) {
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
	
	
	public static void main(String[] args) {
		//Dia 1
		int comensales1 = getComensales(0.5, 50);
		System.out.println(comensales1);
		int comensales2 = getComensales(2,1);
		System.out.println(comensales2);
		int comensales3 = getComensales(50,0.5);
		System.out.println(comensales3);
		
	}

}
