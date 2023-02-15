package introduccion;

public class Arrays_bidimensionales {

	public static void main(String[] args) {
		
		
		int[][] matrix = {
				{10,5,16,20},
				{34,60,30,50},
				{4,20,10,80},
				{4,20,10,80}
	
		};
		
		for (int i=0; i<4; i++) {
			System.out.println();
			for(int j=0; j<5; i++) {
				
				System.out.println(matrix[i][j]+ " ");
			}
		}
		
		
	}
}