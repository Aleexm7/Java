package oop;

public class ConsumoMain {

	public static void main(String[] args) {
		Consumo obj = new Consumo(100, 8.50, 50, 1.60);
		obj.kms = 120;
		obj.litros = 6;
		obj.velocidadMedia = 80;
		obj.getTiempo();
		System.out.println(obj);
		
		

	}

}
