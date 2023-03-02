package ejercicio.persona;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;





public class TestPersona {

	@Test
	void testNotEquals() {
		Persona persona = new Persona();

		double altura = 1.80;
		persona.setAltura(altura);

		assertEquals(persona.getAltura(), altura);
		
		double newAltura = 1.90;
		persona.setAltura(newAltura);
		
		assertNotEquals(persona.getAltura(), altura);
	}

	
	
	@Test
	void testAltura() {
		Persona persona = new Persona();

		double altura = 1.80;
		persona.setAltura(altura);

		assertEquals(persona.getAltura(), altura);
	}

	

	@Test
	void testPeso() {
		Persona persona = new Persona();

		double peso = 58.70;
		persona.setPeso(peso);

		assertEquals(persona.getPeso(), peso);
	}

	@Test
	void testEdad() {
		int edad = 20;
		Persona persona = new Persona("Pepito",edad, "H");
		
		assertEquals(persona.getEdad(), edad);
	}
	
	@Test
	void tesParametro() {
		int edad = 33;
		String nombre = "Alfredo";
		String sexo = "M";
		double peso = 60;
		double altura = 1.82;
		
		Persona persona = new Persona(nombre,edad, sexo , peso, altura);
		
		
		
		assertEquals(persona.getEdad(), edad);
		assertEquals(persona.getNombre(), nombre);
		assertEquals(persona.getSexo(), sexo);
		assertEquals(persona.getPeso(), peso);
		assertEquals(persona.getAltura(), altura);
	}
	
	@Test
	void tesParametro1() {
	
		String nombre = "Paula";
		int edad = 18;
		String sexo = "M";
		
		Persona persona = new Persona(nombre, edad, sexo);
		
		
		
		assertEquals(persona.getNombre(),nombre);
		assertEquals(persona.getEdad(),edad);
		assertEquals(persona.getSexo(),sexo);
	}
}
