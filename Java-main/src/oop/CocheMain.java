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
		
		
	}

}
