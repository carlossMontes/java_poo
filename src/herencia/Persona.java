package herencia;

public class Persona {
	
	private String curp;
	private String nombre;
	
	// Constructor
	public Persona(String curp, String nombre) {
		super();
		this.curp = curp;
		this.nombre = nombre;
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

}
