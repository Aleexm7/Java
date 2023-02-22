package introduccion;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapMain {

	public static void main(String[] args) {
		

		
		Map<String, String>persona = new HashMap<>();
		
		persona.put("5432712R", "Antonio Ortiz ");
		persona.put("5432712Q", "Lucas Rodriguez ");
		persona.put("5432712V", "Lucas Fernandez ");
		
		System.out.println(persona);
		//Este bucle nos permitira obtener solo los dni
		for(String dni : persona.keySet()) { //  Con .keySet obtendremos la clave
			System.out.println(dni);
		}
		
		//Este bucle nos permitira obtener solo los nombres completos
		for(String nombre : persona.values()) { //  Con .values obtendremos los valores
			System.out.println(nombre);
		}
		
		//Este bucle nos permitira obtener la key y los valores para despues mostrarlo todo por pantalla
		for(Map.Entry<String, String> entry : persona.entrySet()) {
			
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}

}
