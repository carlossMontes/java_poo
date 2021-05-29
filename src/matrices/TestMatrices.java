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
		File logR = new File(url + "log.txt");
		FileWriter logW = new FileWriter(url + "log.txt");
		FileWriter txt = null;
		Scanner sc = null;

		// Lectura de log;
		try {
			System.out.println("...Leyendo el log");
			sc = new Scanner(logR);

			while (sc.hasNextLine()) {
				sc.nextLine();
				contador++;
			}

			System.out.println("La cantidad de lineas es " + contador);

			contador++;
			logW.write(contador);
			logW.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			txt = new FileWriter(url + "nums-" + contador);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Existió algún error en el proceso");
			e.printStackTrace();
		}

		int cont = 0;
		for (int i = 0; i < nNums.length; i++) { // Ciclo para las filas
			for (int j = 0; j < nNums[i].length; j++) { // Ciclo para las columnas
				nNums[i][j] = cont;
				cont++;
			}
		}

		for (int i = 0; i < nNums.length; i++) { // Ciclo para las filas
			for (int j = 0; j < nNums[i].length; j++) { // Ciclo para las columnas
				System.out.print(nNums[i][j] + " ");
			}
			System.out.println();
		}
	}

}
