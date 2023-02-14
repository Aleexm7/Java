package introduccion;



import javax.swing.JOptionPane;

public class Uso_Arrays2 {

	public static void main(String[] args) {
		
		
		
		String [] paises = new String[8];//Declaramos la matriz con 8 elementos
		
		for(int i=0; i<8; i++) {//Rellenamos la matriz con un bucle for 
			
			paises[i]= JOptionPane.showInputDialog("Introduce un pais");//Añadiremos el contenido de nuestro array manualmente
		}
		
		for(String elemento:paises) {//Recorre la matriz rellenada anteriormente
			
			System.out.println(elemento); //Imprimir el resultado
		}

	}

}
