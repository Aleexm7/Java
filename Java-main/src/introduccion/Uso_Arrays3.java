package introduccion;

public class Uso_Arrays3 {

	public static void main(String[] args) {
		
		int[] miMatrizAleatoria = new int[150];//Declaramos la matriz con 150 elementos
		
		for(int i=0; i<miMatrizAleatoria.length; i++) { //Rellenamos la mateiz con un bucle for hasta el final de la longitud del array
			
			miMatrizAleatoria[i]=(int)Math.round(Math.random()*100); //Rellenamos el array con numeros aleatorios(Redondeados)
		}
		
		for(int numeros:miMatrizAleatoria) {//Recorre la matriz rellenada anteriormente
			
			System.out.println(numeros); //Imprimir el resultado
		}
	}

}
