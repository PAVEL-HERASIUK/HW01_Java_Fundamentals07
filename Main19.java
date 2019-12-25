package by.htp.les07.main;

public class Main19 {

	public static void main(String[] args) {
		// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
		// 11111111
		// 01111110
		// 00111100
		// 00011000
		// 00111100
		// 01111110
		// 11111111
		int n = 12;
		int[][] mas = new int[n][n];

		init(mas);
		printMas(mas);
	}

	public static void init(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length / 2; i++) {
			for (j = 0; j < mas[i].length / 2; j++) {
				if (j < i) {
					mas[i][j] = 0;
					mas[i][mas.length - 1 - j] = 0;
					mas[mas.length - 1 - i][j] = 0;
					mas[mas.length - 1 - i][mas.length - 1 - j] = 0;
				} else {
					mas[i][j] = 1;
					mas[i][mas.length - 1 - j] = 1;
					mas[mas.length - 1 - i][j] = 1;
					mas[mas.length - 1 - i][mas.length - 1 - j] = 1;
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
