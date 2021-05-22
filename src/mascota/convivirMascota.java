package mascota;

import java.util.Scanner;

public class convivirMascota {
	public static void main(String[] args) {
		// Variable de opcion para el menu | Metodo de lectura de teclado | Objeto mascota
		byte opcion;
		Scanner sc = new Scanner(System.in);
		Mascota mascota = new Mascota();

		// Mensaje de bienvenida y despliegue de opciones
		System.out.println("Bienvenido al programa 'Convivir con tu mascota'\n");
		System.out.println("Por favor selecciona una opción en el menú:");
		System.out.println(
				"1. Alimentar -->\t Aumenta el 10% de vida\n2. Golpear   -->\t Quita 10% de vida\n3. Revivir   -->\t Es obvio\n4. Matar     -->\t Es obvio\n5. Salir     -->\t Cerrar la aplicación\n");
		
		// Lectura por teclado
		opcion = sc.nextByte();
		
		// Loop que ejecuta los metodos segun la opción. 5 finaliza el loop
		while (opcion != 5) {
			
			switch (opcion) {
				case 1:
					System.out.println("Estas presionando el 1");
					System.out.println(mascota.alimentar());
					break;
				case 2:
					System.out.println("Estas presionando el 2");
					System.out.println(mascota.golpear());
					break;
				case 3:
					System.out.println("Estas presionando el 3");
					System.out.println(mascota.revivir());
					break;
				case 4:
					System.out.println("Estas presionando el 4");
					System.out.println(mascota.matar());
					break;
				default:
					System.out.println("No es un número válido");
			}
			opcion = sc.nextByte();
		}
		
		System.out.println("Bye!");
	}

}
