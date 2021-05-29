package matrices;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class TestMatrices {

	public static void main(String[] args) throws IOException {

		// 3 filas, 4 columnas
		int[][] nNums = new int[3][3];
		String url = "/home/cmontes/Documentos/java/nums/";
		int contador = 0;

		// Objetos
		Random rd = new Random();
		File fichero = new File(url + "log.txt");
//		FileWriter logW = new FileWriter(url + "log.txt");
		FileWriter txt = null;
		Scanner s = null;

		// Lectura de log;
		// Fichero del que queremos leer

		try {
			// Leemos el contenido del fichero
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(fichero);

			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				String linea = s.nextLine(); // Guardamos la linea en un String
				System.out.println(linea); // Imprimimos la linea
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}

//		try {
//			txt = new FileWriter(url + "nums-" + contador);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("Existió algún error en el proceso");
//			e.printStackTrace();
//		}

//		int cont = 0;
//		for (int i = 0; i < nNums.length; i++) { // Ciclo para las filas
//			for (int j = 0; j < nNums[i].length; j++) { // Ciclo para las columnas
//				nNums[i][j] = cont;
//				cont++;
//			}
//		}
//
//		for (int i = 0; i < nNums.length; i++) { // Ciclo para las filas
//			for (int j = 0; j < nNums[i].length; j++) { // Ciclo para las columnas
//				System.out.print(nNums[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

}
