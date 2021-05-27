package escuela;

import java.util.Scanner;

public class TestEscuela {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cant;
		
		System.out.println("___________________________________");
		System.out.println("BIENVENIDO AL SISTEMA ESCOLAR INTERNO");
		System.out.println("___________________________________");
		
		System.out.print("¿Cuántos alumnos desea registrar?: ");
		cant = Integer.parseInt(sc.nextLine());
		System.out.println(cant);
		Alumno[] alumno = new Alumno[cant];
		
		for (int i = 0; i < alumno.length; i++) {
			System.out.print("Ingrese nombre: ");
			String nombre = sc.nextLine();
			
			System.out.println("¿Cuántas notas desea ingresar?: ");
			int cantNotas = Integer.parseInt(sc.nextLine());
			
			Alumno a = new Alumno(nombre, cantNotas);
			a.ingresarNotas();
			
			alumno[i] = a;
		}
		
		for (int i = 0; i < alumno.length; i++) {
			alumno[i].mostrarNotas();
		}
	}

}
