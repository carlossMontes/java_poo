package abstracta;

public class testAbstracta {

	public static void main(String[] args) {

		Circulo circ = new Circulo("Mixtli", 14.59);
		System.out.println("Área de: " + circ.getNombre() + " es igual a " + circ.calcularArea());
		System.out.println("Perimetro de: " + circ.getNombre() + " es igual a " + circ.calcularPerimetro());
		
		Cuadrado cuad = new Cuadrado("Carlos", 25);
		System.out.println("\nÁrea de: " + cuad.getNombre() + " es igual a " + cuad.calcularArea());
		System.out.println("Perimetro de: " + cuad.getNombre() + " es igual a " + cuad.calcularPerimetro());
	}

}
