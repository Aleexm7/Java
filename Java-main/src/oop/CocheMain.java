package oop;

public class CocheMain {

	
	
	public static void main(String[] args) {
		
		
		Coche cocheObj2 = new Coche("Red", "Mercedes", "LG200",234.54, 34.56);//Creamos el objeto accediento al constructor creado anteriormente.
		
		cocheObj2.acelerar(50);//Modificamos la velocidad accediendo al metodo creado anteriormente
		cocheObj2.peso = 200; //Modificar el peso accediendo al atributo que hemnos creado anteriormente
		System.out.println(cocheObj2);
		
		Coche cocheObj = new Coche("Black", "Audi" , "A1", 400.56, 60.56); //Creamos otro objeto
		cocheObj.acelerar(100);
		cocheObj.peso = 250;
		cocheObj.modelo = "A500";
		System.out.println(cocheObj);
		
		CocheElectrico cocheElectrico = new CocheElectrico();	//Creamos el objeto de la clase CocheElectrico
		
		//Cambiamos los atributos
		cocheElectrico.motorElectrico = "Motor electrico 1"; 
		cocheElectrico.modelo = "V500";
		cocheElectrico.fabricante = "Tesla";
		
		System.out.println(cocheElectrico);
		
		CocheElectrico cocheElectrico2 = new CocheElectrico("Azul","Tesla","AV23",234.54,350,"Motor Electrico 2");
		cocheElectrico2.acelerar(30);
		System.out.println(cocheElectrico2);
		
		
		CocheHibrido cocheHibrido = new CocheHibrido();
		cocheHibrido.color = "Red";
		cocheHibrido.modelo = "Toyota";
		cocheHibrido.motorHibrido = "Ejemplo motor hibrido";
		
		System.out.println(cocheHibrido);		
	}

}
