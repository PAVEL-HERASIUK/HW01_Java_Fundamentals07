package by.htp.les07.main;

public class Main21 {
	// 21. Сформировать квадратную матрицу порядка n по заданному образцу(n -
	// четное)
	// n   0   0 0 0 0
	// n-1 n   0 0 0 0
	// n-2 n-1 n 0 0 0
	// .................
	// 2  3    4 n-1 n 0
	// 1  2    3 n-2 n-1 n
	public static void main(String[] args) {
		int n = 10;
		int[][] mas = new int[n][n];

		init(mas);
		printMas(mas);
	}

	public static void init(int[][] mas) {
		int i;
		int j;
		int temp;

		for (i = 0; i < mas.length; i++) {
			temp = i;
			for (j = 0; j < mas[i].length; j++) {
				if (j <= i) {
					mas[i][j] = mas[i].length - temp;
					temp--;
				} else {
					mas[i][j] = 0;
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