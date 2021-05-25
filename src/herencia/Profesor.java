package herencia;

public class Profesor extends Trabajador{
	
	private String titulo;

	public Profesor(String curp, String nombre, int sueldo, String titulo) {
		super(curp, nombre, sueldo);
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Profesor [titulo=" + titulo + ", Sueldo=" + super.getSueldo() + ", CURP=" + super.getCurp() + "]";
	}
	
	
}
