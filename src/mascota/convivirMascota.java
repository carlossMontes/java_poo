package mascota;

import java.util.Scanner;

public class convivirMascota {
	public static void main(String[] args) {
		byte opcion;

		System.out.println("Bienvenido al programa 'Convivir con tu mascota'\n");
		System.out.println("Por favor selecciona una opción en el menú:");
		System.out.println(
				"1. Alimentar -->\t Aumenta el 10% de vida\n2. Golpear   -->\t Quita 10% de vida\n3. Revivir   -->\t Es obvio\n4. Matar     -->\t Es obvio\n5. Salir     -->\t Cerrar la aplicación\n");

		Scanner sc = new Scanner(System.in);
		opcion = sc.nextByte();

		while (opcion != 5) {
//			Mascota mascota = new Mascota();
			switch (opcion) {
				case 1:
					System.out.println("Estas presionando el 1");
					break;
				case 2:
					System.out.println("Estas presionando el 2");
					break;
				case 3:
					System.out.println("Estas presionando el 3");
					break;
				case 4:
					System.out.println("Estas presionando el 4");
					break;
				default:
					System.out.println("No es un número válido");
			}
			opcion = sc.nextByte();
		}
	}

}
