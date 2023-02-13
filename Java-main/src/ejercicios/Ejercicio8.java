package ejercicios;



public class Ejercicio8 {

	public static void main(String[] args) {
		//Creamos la variable sin almacenarle un valor para utilizarla después en el código
				char ResultadoFinal ; 
				
				/**Creamos la variable para que genere un numero aleatorio (del alfabeto ASCII) que va desde el 65 al 90.
				 * Esta funcion nos generará solo letras del alfabeto pero en mayúsculas
				 * */
				int CaracterAleatorio = (int)(Math.random()*26 + 65);
				
				 ResultadoFinal = (char) CaracterAleatorio;
				
				
				//Creamos un switch para saber si es vocal o consonante
				switch (ResultadoFinal){
				case 'a':
					System.out.println("La letra" + " " + ResultadoFinal + " " + "es una vocal");
					break;
				case 'e':
					System.out.println("La letra" + " " + ResultadoFinal + " " + "es una vocal");
					break;
				case 'i':
					System.out.println("La letra" + " " + ResultadoFinal + " " + "es una vocal");
					break;
				case 'o':
					System.out.println("La letra" + " " + ResultadoFinal + " " + "es una vocal");
					break;
				case 'u':
					System.out.println("La letra" + " " + ResultadoFinal + " " + "es una vocal");
					break;
				default:
					System.out.println("La letra" + " "+ ResultadoFinal +" " + "es una consonante");
				}

	}

}
