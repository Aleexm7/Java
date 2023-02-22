package introduccion;

public class TryCatchMain {

	
	
	
	public static void main(String[] args) {
	
		try {
			
			int resultado = 5 / 0; //Si imprimimos esto por pantalla dará un error, pero si creamo un try y catch evitarás ese error
			
		}catch(ArithmeticException e){//Ponemos el nombre de la exepcion del error
			
			e.printStackTrace();
		} finally { 
			System.out.println("Cierre de recursos");
		}
		
		
		
		System.out.println("Fin");
	}

}
