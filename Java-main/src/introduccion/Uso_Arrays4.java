package introduccion;

public class Uso_Arrays4 {

	public static void main(String[] args) {
		
		int [] notas = new int [10]; //Creamos el Array con 10 posiciones
		
		
		notas[0] = 10; //Modificamos la posicion 0 del Array
		notas[3] = 20; //Modificamos la posicion 3 del Array
		
		System.out.println(notas[0]);
		
		
		int [] notas1 = {10,6,5,7,5,7,9}; //Otra forma de crear un Array
		
		
		for(int i = 0; i < notas1.length; i++) {
			
			
			System.out.println(notas1[i]);
		}
		
		for(int item :notas1) { //Creamos un For Each que recorra el Array notas1
			System.out.println(item);
		}
		
	}
}