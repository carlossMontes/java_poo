package escuela;

import java.util.Scanner;

public class Alumno {

	// Atributos
	private String nombre;
	private float[] arrNotas;
	
	/**
	 * 
	 * @param nombre
	 * @param cantidad
	 * @author Carlos Montes
	 * @date 25-05-2021
	 * @desc Constructor del objeto Alumno que pide su nombre y la cantidad de notas a ingresar
	 */
	public Alumno(String nombre, int cantidad) {
		this.nombre = nombre;
		arrNotas = new float[cantidad];
	}
	
	/**
	 * @author Carlos Montes
	 * @date 25-05-2021
	 * @desc Metodo para ingresar las notas por teclado
	 */
	public void ingresarNotas() {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arrNotas.length; i++) {
			System.out.print("Ingrese nota " + (i+1) + ": ");
			arrNotas[i] = Float.parseFloat(sc.nextLine());
		}
	}
	
	private String getNombre() {
		return this.nombre;
	}
	
	/**
	 * @author Carlos Montes
	 * @date 25-05-2021
	 * @desc Metoodo para mostrar las notas del alumno
	 */
	public void mostrarNotas() {
		System.out.println("____________________________");
		System.out.println("INFORME DE NOTAS DE [" + getNombre() + "]");
		System.out.println("____________________________");
		for (int i = 0; i < arrNotas.length; i++) {
			System.out.println(arrNotas[i]);
		}
		
		System.out.println("PROMEDIO --> " + promediarNotas());
		System.out.println("____________________________");
	}
	
	/**
	 * @author Carlos Montes
	 * @date 25-05-2021
	 * @desc Metodo para calcular el promedio de las notas
	 */
	private float promediarNotas() {
		float suma = 0, promedio;
		
		for (int i = 0; i < arrNotas.length; i++) {
			suma += arrNotas[i];
		}
		
		promedio = suma / arrNotas.length;
		return promedio;
	}
	
	
}
