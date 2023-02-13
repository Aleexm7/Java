package introduccion;

public class Boolean {

	public static void main(String[] args) {

		int m = 2, n = 5;

		boolean resultado;

		resultado = m > n && m <= n; // resultado = false
		System.out.println(resultado);

		resultado = !(m < n || m >= n); // resultado = true
		System.out.println(resultado);

	}

}
