package exercises.chapter1.section1;

public class Exercise12 {
	public static void main(String[] args) {
		int[][] arrayM = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] t = new int[3][3];

		// 0 1 2 of x = 0 0 0 of y
		for (int i = 0; i < arrayM.length; i++) {
			for (int j = 0; j < arrayM[i].length; j++) {
				t[i][j] = arrayM[j][i];
			}
		}
		// print the transposed matrix
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}
	}
}
