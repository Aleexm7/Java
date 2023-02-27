package ejercicio.persona;

import java.util.Random;

public class Persona {

	private String nombre;
	private int edad;
	private double peso;
	private double altura;
	private String sexo;
	private String dni;

	private static final String SEXO = "H";
	private static final int BAJO_PESO = -1;
	private static final int PESO_SALUDABLE = 0;
	private static final int SOBREPESO = 1;

	public Persona() {
		nombre = "";
		sexo = SEXO;
		edad = 0;
		peso = 0;
		altura = 0;
	}

	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		peso = 0;
		altura = 0;

	}

	public Persona(String nombre, int edad, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		generarDNI();
	}

	private int CalculaIMC() {
		double imc = peso / Math.pow(altura, 2);

		if (imc < 20) {
			return BAJO_PESO;
		} else if (imc <= 25) {
			return PESO_SALUDABLE;
		} else {
			return SOBREPESO;
		}
	}

	private boolean esMayorDeEdad(int edad) {

		if (edad < 18) {
			return false;
		} else {
			return true;
		}
	}

	private void comprobarSexo(String s) {

		if (s.equalsIgnoreCase("M")) {
			sexo = s;
		} else {
			sexo = SEXO;
		}
	}

	private char caracterAleatorio() {
		final String LETRA = "TRWAGMYFPDXBNJZSQVHLCKE"; // Creamos una constante para generar caracteres aleatorios a
														// partir de esa constante
		Random random = new Random(); // Creamos el objeto random

		char letraAleatoria = LETRA.charAt(random.nextInt(LETRA.length())); // Generar Caracter aleatorio

		return letraAleatoria; // Devolver caracter para implementarlo en dni
	}

	private void generarDNI() {

		Random random = new Random();
		int numeroAleatorio = random.nextInt(99999999) + 10000000; // Generar numero aleatorio de 8 digitos

		dni = Integer.toString(numeroAleatorio) + caracterAleatorio();
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + ", sexo="
				+ sexo + ", dni=" + dni + "]";
	}

	public static void main(String[] args) {

		// Creamos objetos
		Persona persona1 = new Persona("Alfredo", 33, "H", 60, 1.82);
		Persona persona2 = new Persona("Antonia", 10, "m", 70.65, 1.66);
		Persona persona3 = new Persona("Paula", 29, "M", 60.79, 1.67);

		System.out.println(persona1);
		System.out.println(persona1.CalculaIMC());
		System.out.println(persona1.esMayorDeEdad(33));

		System.out.println(persona2);
		System.out.println(persona2.CalculaIMC());
		System.out.println(persona2.esMayorDeEdad(10));

		System.out.println(persona3);
		System.out.println(persona3.CalculaIMC());
		System.out.println(persona3.esMayorDeEdad(29));

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	
	
	
	
}
