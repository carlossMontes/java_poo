package escuela;

import java.util.Scanner;

public class TestEscuela {

	public static void main(String[] args) {

		// Variables
		int cant;

		// Objetos
		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenidos a la UTNG\nIngrese la cantidad de alumnos");
		cant = sc.nextInt();
		
		// Creacion de arreglo de objetos
		Alumno arrAlumno[] = new Alumno[cant];
		
		for (int i = 0; i < cant; i++) {
			System.out.println(cant);
		}
	}

}
