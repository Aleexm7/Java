package oop.coninterfaces;

import java.util.List;
import oop.sininterfaces.Empleado;

/**
 * Se declara los métodos, no se implementan Actúa como un contrato, dice lo que
 * hay que hacer pero no lo hace
 */

public interface EmpleadoCRUD {

	void guardar(Empleado empleado);

	List<Empleado> findAll();

	void delete(Empleado empleado);

}
