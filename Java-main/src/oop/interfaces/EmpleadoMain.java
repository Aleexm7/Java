package oop.interfaces;

public class EmpleadoMain {

	public static void main(String[] args) {
		
		
		EmpleadoCRUD trabajador = new EmpleadoCRUD();
		
		Empleado juanito = new Empleado("Juanito", 21, 20000, true);
		Empleado maria = new Empleado("Maria", 51, 23500, true);
		Empleado roberto = new Empleado("Roberto", 26, 17000, false);
		
		
		trabajador.guardar(juanito);
		trabajador.guardar(maria);
		trabajador.guardar(roberto);
	}

}
