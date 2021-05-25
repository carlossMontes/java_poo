package herencia;

public class Trabajador extends Persona{

	private int sueldo;

	public Trabajador(String curp, String nombre, int sueldo) {
		super(curp, nombre);
		this.sueldo = sueldo;
	}
	
	public int getSueldo() {
		return this.sueldo;
	}
	
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
}
