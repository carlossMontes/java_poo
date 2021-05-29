package matrices;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TestAll {

	public static void main(String[] args) {
		String url = "/home/cmontes/Documentos/java/nums/";
		int contador = 0;

		File leerArchivo = new File(url + "log.txt");
		FileWriter escribirArchivo = null;
		FileWriter crearArchivo = null;
		Scanner sc = null;

		// Lectura de log
		try {
			// Leemos el contenido del fichero
			System.out.println("... Leemos el contenido del fichero ...");
			sc = new Scanner(leerArchivo);

			// Leemos linea a linea el fichero
			while (sc.hasNextLine()) {
				String linea = sc.nextLine(); // Guardamos la linea en un String
				contador++;
			}

			System.out.println(contador);

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (sc != null)
					sc.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}

		// Creación de nuevo archivo
		try {

			escribirArchivo = new FileWriter(url + "log.txt");
			contador++;
			String previo = escribirArchivo.toString();
			escribirArchivo.write(previo.toString() + "\n" + Integer.toString(contador));
			escribirArchivo.close();

			crearArchivo = new FileWriter(url + "nums-" + contador + ".txt");

			// Escribimos linea a linea en el fichero
			crearArchivo.write("Construido");

			crearArchivo.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}

	}

}
