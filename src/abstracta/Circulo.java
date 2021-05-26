package abstracta;

/**
 * Circulo tipo de Figura
 * @author Carlos Montes
 * @date 25/05/2021
 * @version 1.1
 *
 */
public class Circulo extends Figura{

	private double radio;
	
	public Circulo(String nombre, double radio) {
		super(nombre); // Constructor de la clase superior
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		// pi * (radio * radio)
		super.area = Math.PI * (radio * radio);
		return super.area;
	}
	
	@Override
	public double calcularPerimetro() {
		// 2 * pi * radio
		super.perimetro = 2 * Math.PI * radio;
		return super.perimetro;
	}
}
