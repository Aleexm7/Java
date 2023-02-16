package introduccion;

public class BucleWhile {

	public static void main(String[] args) {
		
		
		int contador = 0;
		
		while(contador < 10) {
			
			contador++;//condicion
			
			if(contador == 6) { 
				
				break; //Rompe el fujo de ejecucción
				
				// continue; //Cuando el contador sea igual a 6, saltara esta iteraccion y continuará con la siguiente.
			}
			
			System.out.println("Hola mundo" +  " " + contador);
			
			
		}

		System.out.println("Fin del bucle");
	}

}
