package oop;

public class Coche {

	
	// Atributos
	
	String color;
	String fabricante;
	String modelo;
	double peso;
	double largo;
	int velocidad = 0;
	
	// Constructores
	
	public Coche() {
		
	}
	
	//El metodo constructor recibe una serie de parámetros y tiene que tener el mismo nombre que la clase
	public Coche(String color, String fabricante, String modelo, double peso, double largo ) { 
		
		//Asignamos los parametos del metodo constructor a los atributos de la clase
		this.color = color; 
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.peso = peso;
		this.largo = largo;
	}
	
	

	// Comportamiento
	
	public void acelerar(int cantidad) {
		
		if(cantidad > 0 && cantidad <= 120) { //Si la cantidad es mayor que 0 y menor o igual que 120.
			this.velocidad += cantidad ;
		}
		
		
		
	}
	
	
	public String toString() {
		
		return "Coche : " + " " + color + " " + fabricante + " " + modelo + " " + peso +"Kg" + " " + largo + "m" + " " + velocidad + "kmh";
	}
	
}
