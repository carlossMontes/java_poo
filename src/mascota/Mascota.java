package mascota;

public class Mascota {
	// Atributos
	private String nombre;
	private byte vida;
	
	// Constructores
	// Constructor por defecto
	public Mascota() {
		this.nombre = "Sin nombre";
		this.vida = 100;
	}
	
	public Mascota(String nombre, byte vida) {
		this.nombre = nombre;
		this.vida = vida;
	}
	
	// Metodos
}
