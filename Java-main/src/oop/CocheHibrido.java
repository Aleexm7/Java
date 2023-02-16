package oop;

public class CocheHibrido extends Coche{

	String motorHibrido;
	
	public CocheHibrido() {
		
	}
	
	
	public CocheHibrido(String motor) {
		this.motorHibrido = motor;
		
	}
	
	@Override
	public String toString() {

		return "Coche hibrido : " + " " + color + " " + fabricante + " " + modelo + " " + peso + "Kg" + " " + largo + "m" + " "
				+ velocidad + "kmh" + " " + motorHibrido;
	}
}
