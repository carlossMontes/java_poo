package matrices;

// Clases necesarias
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class TestAll {

	public static void main(String[] args) {

		// 3 filas, 4 columnas
		int[][] nNums = new int[3][3];

		// Declaracion de variables globales
		String url = "/home/cmontes/Documentos/java/nums/";
		int contador = 0;

		// Objetos creados. Los nulos serán instanciados más adelante
		File leerArchivo = new File(url + "info.log");
		FileWriter crearArchivo = null;
		Scanner sc = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		Random rd = new Random();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();

		// Lectura de log
		try {
			// Leemos el contenido del fichero
			System.out.println("... Leemos el contenido del fichero ...");
			sc = new Scanner(leerArchivo);

			// Leemos linea a linea el fichero
			while (sc.hasNextLine()) {
				sc.nextLine(); // Guardamos la linea en un String
				contador++;
			}

			System.out.println(contador);

		} catch (Exception ex) {
			// En caso de error manda el mensaje
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

			// Objetos instanciados. Se crea el escritor y el que toma todo lo que había
			// antes
			fw = new FileWriter(leerArchivo.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			bw.write(dtf.format(now) + " ");
			bw.write(Integer.toString(contador + 1) + "\n");
			System.out.println("información agregada!");

			// Se crea nuevo archivo con el numero correspondiente del log
			crearArchivo = new FileWriter(url + "nums-" + contador + ".csv");

			for (int i = 0; i < nNums.length; i++) { // Ciclo para las filas
				for (int j = 0; j < nNums[i].length; j++) { // Ciclo para las columnas
					nNums[i][j] = rd.nextInt(100);
				}
			}

			for (int i = 0; i < nNums.length; i++) { // Ciclo para las filas
				for (int j = 0; j < nNums[i].length; j++) { // Ciclo para las columnas
					crearArchivo.write(nNums[i][j] + ",");
				}
				crearArchivo.write("\n");
			}

			crearArchivo.close();

		} catch (Exception ex) {
			// Imprime mensaje de error
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		} finally {
			try {
				// Cierra instancias de FileWriter y BufferedWriter
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
