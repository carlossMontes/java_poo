package matrices;

public class TestMatrices {

	public static void main(String[] args) {

		// 3 filas, 4 columnas
		int[][] nNums = new int[10][10];

		for (int i = 0; i < nNums.length; i++) { // Ciclo para las filas
			for (int j = 0; j < nNums[i].length; j++) { // Ciclo para las columnas
				nNums[i][j] = 1;
				System.out.println("[" + i + "]" + "[" + j + "]");
			}
			
			System.out.println("-------------------");
		}
	}

}
