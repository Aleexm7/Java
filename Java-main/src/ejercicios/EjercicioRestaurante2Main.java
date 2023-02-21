package ejercicios;

public class EjercicioRestaurante2Main {
	
	
	

	public static void main(String[] args) {
		EjercicioRestaurante2 cliente = new EjercicioRestaurante2(50,3);
		
		cliente.addPapas(60);
		cliente.addChocos(5);
		System.out.println("Comensales en total: " + " " +cliente.getComensales(60, 5));
		cliente.showChocos();
		cliente.showPapas();
	

	}

}
