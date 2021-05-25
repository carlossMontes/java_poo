package stringDoc;

public class Something {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("MORC", "Carlos", 23);
		Persona p2 = new Persona("SIXE", "Mixtli", 22);
		
		Cualquiera c = new Cualquiera();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.getCurp());

		// Forma nomal
		c.metodoX();
		
		// Forma con un metodo estatico
		Cualquiera.metodoX();
		
	}

}
