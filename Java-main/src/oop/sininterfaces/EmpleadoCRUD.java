package oop.sininterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

	
	private List<Empleado> empleados = new ArrayList<>();
	
	
	//Guardar un empleado
	public void guardar(Empleado empleado) {
		
		empleados.add(empleado);
	}
	
	public List<Empleado> findAll(){
		
		return empleados;
	}
}
