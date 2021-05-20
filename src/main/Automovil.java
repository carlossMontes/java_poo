package main;

public class Automovil {
	// Atributos
	private String placa;
	private String modelo;
	private String marca;
	private int anio;
	private int precio;

	// Constructores
	// Constructor por defecto
	public Automovil() {
		this.placa = "N/A";
		this.modelo = "Sin modelo";
		this.marca = "Sin marca";
		this.anio = 0;
		this.precio = 0;
	}

	public Automovil(String placa, String modelo, String marca, int anio, int precio) {
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.anio = anio;
		this.precio = precio;
	}

	// Metodos
	// getters
	public String getPlaca() {
		return this.placa;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public int getAnio() {
		return this.anio;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	// setters
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
