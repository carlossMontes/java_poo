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
}
