package introduccion;

public class Arrays_bidimensionales {

	public static void main(String[] args) {
		
		
		//ARRAY BIDIMENSIONAL 1
		int[][] matrix = {
				{10,5,16,20},
				{34,60,30,50},
				{4,20,10,80},
				{4,20,10,80}
	
		};
		
		for (int i=0; i<4; i++) {
			System.out.println();
			for(int j=0; j<4; j++) {
				
				System.out.print(matrix[i][j]+ " ");
			}
		}
		
		//ARRAY BIDIMENSIONAL 2
	
		
		int arrayBidi[][] = new int[2][4]; //El primer elemento son las filas y el segundo las columnas
		
		arrayBidi[0][0] = 1;
		arrayBidi[0][1] = 2;
		arrayBidi[0][2] = 3;
		arrayBidi[0][3] = 4;
		
		arrayBidi[1][0] = 10;
		arrayBidi[1][1] = 20;
		arrayBidi[1][2] = 30;
		arrayBidi[1][3] = 40;
		
		
		for(int i = 0; i < arrayBidi.length; i++) {
			
			System.out.println("Valor de i : " + i); //Accedemos a las filas con este for
		
		
		for (int j = 0; j < arrayBidi[1].length; j ++ ) { //Iteramos sobre las filas 
			
			System.out.println("Estoy en  i = " + i + " , j =" + j);
			System.out.println(arrayBidi[i][j]);
		}
	}
}
}