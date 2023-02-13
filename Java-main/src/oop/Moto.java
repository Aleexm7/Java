package oop;

public class Moto {

	public String marca;

	public int velocidad;

	public Moto() {
		this.marca = "Toyota";
		this.velocidad = 120;
	}

	public Moto(String marca, int velocidad) {
		this.marca = marca;
		this.velocidad = velocidad;

	}

	public String obtenerMarca() {
		return marca;

	}

	public int obtenerVelocidad() {
		return velocidad;
	}

	public String modificarMarca(String lamarca) {
		this.marca = lamarca;
		return marca;
	}

	public int modificarVelocidad(int lavelocidad) {
		this.velocidad = lavelocidad;
		return lavelocidad;

	}

}
