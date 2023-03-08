package ejercicio.gestionexcepciones;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;

public class testPruebaEdadPersona  {
	

	@BeforeEach
	
	
	public void test1() {
		

		
		Random aleatorio = new Random();
		
        for (int i = 0; i < 100; i++) {
        	
            int edad = aleatorio.nextInt(100) + 1;
            
            try {
            PruebaEdadPersonas	persona1 = new PruebaEdadPersonas();
            	
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
	@BeforeEach
	public void Test2() {
		
		PruebaEdadPersonas persona2 = new PruebaEdadPersonas();
		
		Random aleatorio = new Random();
		
        for (int i = 0; i < 100; i++) {
        	
            int edad = aleatorio.nextInt(100) + 1;
            
            try {
            	
            	persona2.generaExcepcionEdad(edad);
            	
                
            } catch (Exception e) {
                System.out.println("Una excepcion ha sido capturada");
                System.out.println(e.getMessage());
           
        }
	}
	
}

}