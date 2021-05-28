package matrices;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class TestMatrices {

	public static void main(String[] args) {

		// 3 filas, 4 columnas
		int[][] nNums = new int[3][3];
		String url = "/home/cmontes/Documentos/java/nums/";
		int contador = 0;

		// Objetos
		Random rd = new Random();
		File arch = new File(url + "log.txt");
		Scanner sc = null;
		
		try {
			System.out.println("...Leyendo el log");
			sc = new Scanner(arch);
			
			while(sc.hasNextLine()) {
				sc.nextLine();
				contador = contador + 1;
			}
			
			System.out.println("La cantidad de lineas es "+ contador);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
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
