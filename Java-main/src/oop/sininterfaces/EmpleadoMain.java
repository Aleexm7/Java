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
		
		List<Empleado> empleados = empleadoCRUD.findAll();
		System.out.println(empleados);
		
		
		//USAMOS V2
		
		EmpleadoCRUDV2 empleadoCRUDV2 = new EmpleadoCRUDV2();
		
		Empleado pepe = new Empleado("Pepe", 11, 0, false);
		Empleado jose = new Empleado("Jose", 81, 28500, false);
		Empleado laura = new Empleado("Laura", 33, 24000, true);
		
		//GUARDAR EMPLEADOS
		empleadoCRUD.guardar(pepe);
		empleadoCRUD.guardar(jose);
		empleadoCRUD.guardar(laura);
		
		//CONSULTAR EMPLEADOS
		
		List<Empleado> empleado = empleadoCRUDV2.recuperarEmpleado();
		System.out.println(empleado);
		
		
		
		
	}

}
