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

		// Objetos
		Random rd = new Random();

		for (int i = 0; i < nNums.length; i++) { // Ciclo para las filas
			for (int j = 0; j < nNums[i].length; j++) { // Ciclo para las columnas
				nNums[i][j] = rd.nextInt(100);
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
