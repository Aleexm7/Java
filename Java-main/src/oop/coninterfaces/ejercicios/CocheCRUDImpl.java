package oop.coninterfaces.ejercicios;



public class CocheCRUDImpl implements CocheCRUD {

	@Override
	public void save() {
		System.out.println("Se utiiza el metodo save");
		
	}

	@Override
	public void delete() {
		System.out.println("Se utiiza el metodo delete");
		
	}

	@Override
	public void findAll() {
		
		System.out.println("Se utiiza el metodo findAll");
	}

	
}
