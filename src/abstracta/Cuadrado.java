package abstracta;

public class Cuadrado extends Figura {
	
	private double lado;
	
	public Cuadrado(String nombre, double lado) {
		super(nombre);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		super.area = lado * lado;
		return super.area;
	}

	@Override
	public double calcularPerimetro() {
		super.perimetro = lado * 4;
		return super.perimetro;
	}

	
}
