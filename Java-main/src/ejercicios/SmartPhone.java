package ejercicios;

public class SmartPhone extends SmartDevice {

	String SistemaOperativo;
	int Megapixeles;

	public SmartPhone(String marca, String modelo, double peso, double tamaño, double precio, String so,
			int megapixel) {
		super(marca, modelo, peso, tamaño, precio);

		this.SistemaOperativo = so;
		this.Megapixeles = megapixel;
	}

	@Override
	public String toString() {

		return "Teléfono : " + " " + marca + " " + modelo +" "+ peso+"g" + " " + tamaño +"cm" + " " + precio +"€" 
		+ " " + SistemaOperativo+ " " + Megapixeles;
	}
}
