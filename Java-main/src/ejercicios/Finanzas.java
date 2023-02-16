package ejercicios;

public class Finanzas {

	
			//atributos
			double tipoCambio;
			
			//constructores
			Finanzas(){
				tipoCambio = 1.36;
			}
			
			Finanzas(double nuevoCambio){
				tipoCambio = nuevoCambio;
			}
			
			
			//metodos
			public double dolaresToEuros (double dolares) {
				return dolares / tipoCambio;
			}
			
			public double eurosToDolares (double euros) {
				return euros * tipoCambio;
			}
}
