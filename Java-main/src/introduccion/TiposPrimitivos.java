package introduccion;

public class TiposPrimitivos {

	public static void main(String[] args) {
		byte numero = 55;
		System.out.println(numero);
		
		//Convertir valor a byte
		byte NumeroConvertidoByte= (byte)155; 
		System.out.println(NumeroConvertidoByte);
		
		//Convertir valor anterior a short
		
		short Numero2 = numero;
		System.out.println(Numero2);
		
		//Convertir entero a byte (Se pierde informacion)
		int Numero3 = 77;
		numero = (byte) Numero3;
		
		//Se pone comillas simples para tipos char
		
		char caracter = 80;
		System.out.println(caracter);
		
		int entero1 = caracter;
		System.out.println(entero1);
		
		
	
		
		//Enteros tipos Long
		
		long miLong = 2345L;
		System.out.println(miLong);
		
	}

}
