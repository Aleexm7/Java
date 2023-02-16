package introduccion;

public class Funciones {

	// SOBRECARGA DE FUNCIONES

	// Creamos un metodo sin parametros
	public static void holaMundo() {

		System.out.println("Hola mundo");
	}

	/**
	 * Podemos crear otro metodo con el mismo nombre pero tenemos que añadir al
	 * menos un parámetro para que no dé error.
	 */

	public static void holaMundo(String name) { // Si el metodo es public, puedes invocar este metodo en otras clases
		System.out.println("Hola" + " " + name);
	}

	private static void holaMundo(String name, String apellidos) {
		System.out.println("Hola" + " " + name + " " + apellidos);
	}

	private static void holaMundo(int edad) {
		System.out.println(edad + " " + "anios");
	}

	public static void main(String[] args) {

		// Invocamos los metodos

		holaMundo();
		holaMundo("Antonio");
		holaMundo("Antonio", "Rodriguez");
		holaMundo(24);

	}
}
