package introduccion;

public class BuclesFor {
	

	public static void main(String[] args) {
		

		
		int[] numeros = {8, 5, 2};
		
		int suma = 0;
		for(int i = 0; i < numeros.length; i ++) {
			
			suma += numeros[i];
			System.out.println(suma);
		}
	}

}
