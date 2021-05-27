package escuela;

public class Alumno {

	// Atributos
	private String nombre;
	private double calif;
	private double promedio;
	
	// Metodos
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCalif() {
		return calif;
	}

	public void setCalif(double calif) {
		this.calif = calif;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	// Constructor
	public Alumno(String nombre, double calif, double promedio) {
		super();
		this.nombre = nombre;
		this.calif = calif;
		this.promedio = promedio;
	}
	
	/**
	 * 
	 * @return double promedio
	 * @author Carlos Montes
	 * @param Numero de objeto
	 */
	public double calcPromedio() {
		return 0;
	}
	
}
