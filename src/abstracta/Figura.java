package abstracta;

public abstract class Figura {

	private String nombre;
	public double area;
	public double perimetro;
	
	// get and set
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Figura(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
	
}
