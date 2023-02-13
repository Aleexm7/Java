package ejercicios;

public class TemperaturaActual {

	public static void main(String[] args) {
		TemperaturaActual myTemp = new TemperaturaActual();
		System.out.println(myTemp.CelsiusToFarenheit(18.0));

		TemperaturaMejorada TemperaturaActual = new TemperaturaMejorada();
		System.out.println(TemperaturaActual.DevolverTemperatura());

	}

	double CelsiusToFarenheit(double temp) {

		return 1.8 * temp + 32;
	}

	double FarenheitToCelsius(double temp) {

		return (temp - 32) / 1.8;

	}

}
