package introduccion;

public class Uso_Arrays {

	public static void main(String[] args) {
		

		int [] miMatriz ={5,98,38,42,61};//Creamo un array con 5 elementos
	
		
		
		for(int i=0; i<5 ;i++) {
			
			
			System.out.println("Valor de la matriz : " + " " +miMatriz[i]);//Imprimir por pantalla todos los elementos del array
		}
		
		
		int [] miMatriz2 ={5,98,38,42,61,45,67,53,234,12,12,345,5,23,512,21,23,41,34,13};
		
		for(int i=0; i<miMatriz2.length ;i++) {//Añadimos .length para saber la longitud del array
			
			
			System.out.println("Valor de la matriz 2 : " + " " +miMatriz2[i]);//Imprimir por pantalla todos los elementos del array
		}
		
		
	}

}
