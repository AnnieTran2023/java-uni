
public class ArraysMatrix {

	public static void main(String[] args) {

		int[][] m1 = { { 1, 2, 0 }, { 2, 3, 4 } };
		int[][] m2 = { { 3, 2, 5 }, { 6, 4, 3 } };

		int[][] m3 = { { 1, 1, 1, 1 }, { 3, 2, 3, 1 }, { 2, 2, 2, 2 } };
		int[][] m4 = { { 2, 2, 3, 3 }, { 2, 3, 1, 0 }, { 1, 2, 3, 4 } };

		printMatrixSum(m1, m2);

		System.out.println();

		printMatrixSum(m3, m4);
	}

	private static void printMatrixSum(int[][] m1, int[][] m2) {

		String display = "";

		for (int i = 0; i < m1.length; i++) {

			for (int j = 0; j < m1[i].length; j++) {
				int sum = m1[i][j] + m2[i][j];
				display = display + sum + " ";
			}
			if (i != m1.length - 1) {
				display += "\n";
			}

		}
		System.out.println(display);

	}
}
