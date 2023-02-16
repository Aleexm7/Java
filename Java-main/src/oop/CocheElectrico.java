package oop;

//Heredar un objeto de una clase creada anteriormente, hay que usar la palabra reservada extends
public class CocheElectrico extends Coche {

	String motorElectrico;

	public CocheElectrico() {

	}

	public CocheElectrico(String motor) {
		this.motorElectrico = motor;

	}

	public CocheElectrico(String color, String fabricante, String modelo, double peso, double largo,
			String motorElectrico) {
		super(color, fabricante, modelo, peso, largo);// Con el metodo super llamariamos al elelemento padre para
														// heredar dichos parametros, esto se hace para no duplicar
														// codigo
		this.motorElectrico = motorElectrico;//

	}


	@Override /**
				 * Esto es una anotación que permite aportar metadatos a los metodos o
				 * clases(Significa sobreescribir). Esto hace que al compilador le diga que
				 * compruebe si hay un metodo que se llame igual que en la clase padre o superior.
				 *
				 */

	public void acelerar(int cantidad) {
		super.acelerar(cantidad); // Añadiremos esa velocidad a la clase super
	}

	@Override
	public String toString() {

		return "Coche electrico : " + " " + color + " " + fabricante + " " + modelo + " " + peso + "Kg" + " " + largo + "m" + " "
				+ velocidad + "kmh" + " " + motorElectrico;
	}
}
