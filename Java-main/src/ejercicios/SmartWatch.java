package ejercicios;

//La palabra reservada extends, nos permite heredar un objeto de una clase creada anteriormente
public class SmartWatch extends SmartDevice {

	String cargador;

	public SmartWatch(String marca, String modelo, double peso, double tamaño, double precio, String cargador) {
		super(marca, modelo, peso, tamaño, precio);/**
													 * Con el metodo super llamariamos al elelemento padre para heredar
													 * dichos parametros, esto se hace para no duplicar // codigo
													 */

		this.cargador = cargador;
	}

	@Override /**
				 * Esto es una anotación que permite aportar metadatos a los metodos o
				 * clases(Significa sobreescribir). Esto hace que al compilador le diga que
				 * compruebe si hay un metodo que se llame igual que en la clase padre o
				 * superior.
				 *
				 */
	public String toString() {

		return "SmartWatch : " + " " + marca + " " + modelo +" "+ peso+"g" + " " + tamaño +"cm" + " " + precio +"€" + " " + cargador;
	}
}
