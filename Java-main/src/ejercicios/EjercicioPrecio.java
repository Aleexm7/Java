package ejercicios;

public class EjercicioPrecio {

	//Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
	
	
	public static double resultado(double precio ) {
		double impuesto = 1.21;
		
		
		return precio * impuesto;
	}
	
	public static void main(String[] args) {
		
		System.out.println(resultado(120) + " " + "IVA incluido");
		

	}

}
