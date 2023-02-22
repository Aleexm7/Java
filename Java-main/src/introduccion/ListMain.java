package introduccion;

import java.util.ArrayList;
import java.util.List;


public class ListMain {

	
	
	public static void main(String[] args) {
		
		//Creamos una la lista dinámica de tipo String
		List<String> nombres = new ArrayList<>();
		
		//Añadimos los elementos a la lista
		nombres.add("Nombre 1");
		nombres.add("Nombre 2");
		nombres.add("Nombre 3");
		nombres.add("Nombre 4");
		
		
		
		//Este bucle for each iterará 4 veces(Segun la longitud del Array) y mostrará por pantalla 4 nombres
		for(String nombre: nombres) {
			
			System.out.println(nombre);
		}
		
		
		List<ListCoche> coches = new ArrayList<>();
		
		coches.add(new ListCoche("Honda"));
		coches.add(new ListCoche("BMW"));
		coches.add(new ListCoche("Mercedes"));
		
		System.out.println(coches); //Nos mostrará un espacio en memoria, tendremos que crear el metodo toString para poder ver el objeto
		
		for(ListCoche coche : coches){
			System.out.println(coche);
		}
		
	}

}
