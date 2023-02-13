package oop;

public class MotoMain {

	public static void main(String[] args) {
		Moto Moto1 = new Moto();
		Moto Moto2 = new Moto();

		System.out.println("La marca de Moto1 es : " + " " + Moto1.obtenerMarca());
		System.out.println("La velocidad de Moto1 es : " + " " + Moto1.obtenerVelocidad());
		System.out.println("La velocidad modificada de Moto1 es : " + " " + Moto1.modificarVelocidad(300));
		System.out.println("La marca de Moto2 es : " + " " + Moto2.modificarMarca("BMW"));
		System.out.println("La velocidad modificada de Moto2 es : " + " " + Moto2.modificarVelocidad(900));

	}

}
