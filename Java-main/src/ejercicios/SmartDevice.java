package ejercicios;

public class SmartDevice {

	String marca;  //** Creamos los atributos que va a tener el objeto */
	String modelo;
	double peso;
	double tamaño;
	double precio;
	
	
	public SmartDevice() {
		
	}
	
	//El metodo constructor recibe una serie de parámetros y tiene que tener el mismo nombre que la clase
	public SmartDevice(String marca, String modelo, double peso, double tamaño, double precio) { 
		
		this.marca = marca;
		this.modelo = modelo;
		this.peso = peso;
		this.tamaño = tamaño;
		this.precio = precio;
		
	}
	
public String toString() {
		
		return "Dispositivo : " + " " + marca + " " + modelo +" "+ peso+"g" + " " + tamaño +"cm" + " " + precio +"$";
	}
	
	
	
	
}
