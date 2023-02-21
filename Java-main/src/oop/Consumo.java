package oop;

public class Consumo {

	public double kms;
	
	public double litros;
	
	public double velocidadMedia;
	
	public double precioGasolina;
	

	public Consumo(double kms, double litros, int vmed, double pgas) {
	this.kms=kms;
	this.litros = litros;
	this.velocidadMedia = vmed;
	this.precioGasolina = pgas;
	}
	
	
	public double getTiempo() {
		return kms/velocidadMedia;
	}
	
	public double ConsumoMedio(double litros, double kms) {
		
		return (litros * 100)/kms;
		
	}
	
	public double ConsumoEuros(double litros, double kms) {
		return ConsumoMedio(litros, kms)*precioGasolina; //Llamando a la funcion anterior para multiplicarlo por el precio gasolina
	}
	
	public String toString() {
		
		return "El consumo del coche es : " + " " + litros + "L " + "\n " 
		+"kilometros recorridos: "+ " "+ kms + " " + "km " + "\n"
		+ "Velocidad media: " + " " + velocidadMedia + " " + "kmh" + "\n"
		+ "precio gasolina aplicado: " + " "+ precioGasolina;
	}
	
}
