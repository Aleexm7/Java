package introduccion;

import java.util.Scanner;

public class ScannerMain {

	
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Dame tu edad: ");
		
		int edad = scanner.nextInt();
		
		
		System.out.println("los  dato introducido son : " + nombre + " " + edad);
		
	}

}
