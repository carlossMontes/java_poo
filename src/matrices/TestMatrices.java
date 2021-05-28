package matrices;

import java.util.Random;

public class TestMatrices {

	public static void main(String[] args) {

		// 3 filas, 4 columnas
		int[][] nNums = new int[3][3];

		Random rd = new Random();

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
