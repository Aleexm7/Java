package introduccion;

import java.util.Vector;

public class Uso_Vectores {
	
	


	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector(20, 15);//Si no especificamos nada por defecto sera la capacidad de 10 elementos, pero en este caso es de 50. El numero 15 es el incremento

		//Añadir datos a un vector
		
		vector.add(1);//posicion 0. Le añadimos a esa posicion el valor 1
		vector.add(2);//Posicion 1
		
		System.out.println("datos del vector: " + vector);
		
		//Eliminar indice de un vector
		
		vector.remove(1);//Nos referimos a la posicion 
		System.out.println("datos del vector : " + vector);
		
		System.out.println("vector tamanio = " + vector.size() + "y capacidad tamanio = " + vector.capacity() );
	

}
}