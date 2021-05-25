package stringDoc;

public class Persona {
	private String curp;
	private String nombre;
	private int edad;
	
	// Constructor
	public Persona(String curp, String nombre, int edad) {
		super();
		this.curp = curp;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// Metodos
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
	
	
}
