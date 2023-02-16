package introduccion;

public class SwitchCase {
	
	

	public static void main(String[] args) {
		
		
		String weather = "sunny";
		
		switch(weather) {
		
		case "sunny":
			System.out.println("El tiempo está soleado");
			break;
		case "cloudy":
			System.out.println("El tiempo está nublado");
			break;
		default:
			System.out.println("No se ha podido identificar el clima");
			break;
		}

	}

}
