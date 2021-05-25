package stringDoc;

public class Persona {
	private String curp;
	private String nombre;
	private int edad;
	
	// Constructor
	
	/**
	 * Constructor del objeto persona
	 * @param curp como string
	 * @param nombre como string
	 * @param edad como edad
	 */
	public Persona(String curp, String nombre, int edad) {
		super();
		this.curp = curp;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// Metodos
	
	/**
	 * Este metodo recupera el valor de la curp
	 * @return el valor de curp
	 */
	public String getCurp() {
		return curp;
	}
	
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [curp=" + curp + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
