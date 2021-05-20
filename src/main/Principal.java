package main;

public class Principal {

	public static void main(String[] args) {
		Automovil punto, sonic, forte, sienna;
		
		punto = new Automovil("GCM-1334-C", "Punto T-Jet", "Fiat", 2009, 75000);
		sonic = new Automovil();
		forte = new Automovil("GCK-2001-A", "Forte", "Kia", 2017, 155000);
		forte = new Automovil("GCK-2002-A", "Sienna", "Toyota", 2014, 235000);
		
		System.out.println("Automovil de Carlos " + punto.getPlaca() + " " + punto.getModelo() + " " + punto.getMarca() + " " + punto.getAnio() + " $" + punto.getPrecio());
		System.out.println("Automovil de Carlos " + sonic.getPlaca() + " " + sonic.getModelo() + " " + sonic.getMarca() + " " + sonic.getAnio() + " $" + sonic.getPrecio());
		
	}

}
