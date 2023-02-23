package ejercicios.codewars;

public class MathematicalOperations {

	/**
	 * 
	 * Your task is to create a function that does four basic mathematical
	 * operations. The function should take three arguments -
	 * operation(string/char), value1(number), value2(number). The function should
	 * return result of numbers after applying the chosen operation.
	 * 
	 */

	public static int MathematicalOperation(String operador, int number1, int number2){
		
		
		switch(operador) {
		case "+":
			int operacionSuma = number1 + number2;
			return operacionSuma;
		case "-":
			int operacionResta = number1 - number2;
			return operacionResta;
			
		case "*":
			int operacionMultiplicacion = number1 * number2;
			return operacionMultiplicacion;
			
		case "/":
			int operacionDividir = number1 / number2;
			return operacionDividir;
			
		default:
			return 0 ;
		}
		
	}
	
	
	
	public static void main(String[] args) {

		System.out.println(MathematicalOperation("+",4,7));
		System.out.println(MathematicalOperation("-",15,18));
		System.out.println(MathematicalOperation("*",5,5));
		System.out.println(MathematicalOperation("/",49,7));
		
	}

}
