package oop;

public class PolimorfismoMain {

	
	
	public static void main(String[] args) {
		
		
		Coche coche1 = new Coche();
		
		CocheElectrico coche2 = new CocheElectrico();
		
		
		//POLIMORFISMO
		
		//El polimorfismo se utiliza cuando una clase es heredada de otra, podemos crear objetos de la siguiente manera:

		Coche coche4 = new CocheElectrico();
		
		Coche coche5 = new CocheHibrido();
		
		
		if(coche4 instanceof CocheElectrico) { //Con la funcion instanceof nos permite comprobar si este objeto es instancia de una clase
			System.out.println("Es un coche electrico");
		}
		
		if(coche4 instanceof CocheHibrido) {
			System.out.println("Es un coche Hibrido");
		}
		
		if(coche5 instanceof CocheElectrico) {
			System.out.println("Es un coche electrico");
		}
		
		if(coche5 instanceof CocheHibrido) {
			System.out.println("Es un coche Hibrido");
		}
		
	}

}
