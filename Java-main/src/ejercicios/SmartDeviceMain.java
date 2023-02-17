package ejercicios;

public class SmartDeviceMain {

	public static void main(String[] args) {

		// En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis
		// las clases hijas: SmartPhone y SmartWatch.

		//Agregaréis atributos tal cual tendrían esos objetos en la realidad.

		//Crear constructor vacío y con todos los parámetros para cada clase.

		//Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
		

		SmartDevice movil1 = new SmartDevice("Amazon echo", "DOT", 5, 30, 100); // Creamos el objeto1

		SmartWatch movil2 = new SmartWatch("Xiaomi", "L3", 10.32, 30, 150.56, "Tipo C"); // Creamos el objeto2

		SmartPhone movil3 = new SmartPhone("Samsung", "S22", 15.50, 18, 899, "Android", 55);

		System.out.println(movil1);
		System.out.println(movil2);
		System.out.println(movil3);

	}

}
