package ejercicio.gestionexcepciones;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;

public class testPruebaEdadPersona  {
	
	PruebaEdadPersonas persona1; 

	@BeforeEach
	
	
	public void generarPersona() {
		

		
		Random aleatorio = new Random();
		
        for (int i = 0; i < 100; i++) {
        	
            int edad = aleatorio.nextInt(100) + 1;
            
            try {
            	persona1 = new PruebaEdadPersonas();
            	
                persona1.generaExcepcionEdad(edad);
                
            } catch (InfantilException e) {
                System.out.println("Se ha producido una excepción de InfantilException para la edad "+ " " + edad);
            } catch (AdultoException e) {
                System.out.println("Se ha producido una excepción de AdultoException para la edad "+ " " + edad);
            } catch (MayorException e) {
                System.out.println("Se ha producido una excepción de MayorException para la edad "+ " " + edad);
           
        }
	}
	
}

}