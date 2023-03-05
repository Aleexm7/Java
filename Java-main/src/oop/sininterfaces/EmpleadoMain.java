package oop.sininterfaces;

import java.util.List;

public class EmpleadoMain {

	public static void main(String[] args) {
		
		
		EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();
		
		Empleado juanito = new Empleado("Juanito", 21, 20000, true);
		Empleado maria = new Empleado("Maria", 51, 23500, true);
		Empleado roberto = new Empleado("Roberto", 26, 17000, false);
		
		//GUARDAR EMPLEADOS
		empleadoCRUD.guardar(juanito);
		empleadoCRUD.guardar(maria);
		empleadoCRUD.guardar(roberto);
		
		//CONSULTAR EMPLEADOS
		
		List<Empleado> empleados = EmpleadoCRUDV2.recuperarEmpleado();
		System.out.println(empleados);
	}

}
