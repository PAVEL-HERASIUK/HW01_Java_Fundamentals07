package by.htp.les07.main;

public class Main18 {

	public static void main(String[] args) {
		// 18. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		// четное)
		// 1 1 111111
		// 2 2 222220
		// 3 3 333300
		// n-1 n-1 000000
		// n 0 0000000

		int n = 8;
		int[][] mas = new int[n][n];

		init(mas);
		printMas(mas);
	}

	public static void init(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				if (j >= mas.length - i) {
					mas[i][j] = 0;
				} else {
					mas[i][j] = i + 1;
				}
			}
		}
	}

	public static void printMas(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.printf("% 2d ", mas[i][j]);
			}
			System.out.println();
		}
	}
}