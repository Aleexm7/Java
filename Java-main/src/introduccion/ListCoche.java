package introduccion;

public class ListCoche {

	String nombre;
	
	
	public ListCoche(String nombre) {
		this.nombre = nombre;
		
	}


	// Creamos el metodo toString para mostrar en pantalla la lista de coches
	@Override
	public String toString() {
		return "ListCoche [nombre=" + nombre + "]";
	}
	
	
}
