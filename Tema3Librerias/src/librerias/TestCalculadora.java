package librerias;

public class TestCalculadora {

	static void  pruebaUnitariasSuma() {
		Calculadora mycalculadora = new Calculadora();
		int sumando1 = 1;
		int sumando2 = 1;
		int primeraSuma = mycalculadora.suma(1, 1);
		
		
		if(primeraSuma != 2) {
			System.out.println("La prueba unitaria esta mal");
		}
		 sumando1 = 2;
		 sumando2 = 1;
		 primeraSuma = mycalculadora.suma(2, 1);
		
		
		if(primeraSuma != 4) {
			System.out.println("La prueba unitaria esta mal");
		}
		
		sumando1 = 6;
		 sumando2 = 5;
		 primeraSuma = mycalculadora.suma(6, 5);
		
		
		if(primeraSuma != 4) {
			System.out.println("La prueba unitaria esta mal");
		}
	}

	public static void main(String[] args) {
		
		pruebaUnitariasSuma();
	}
}
