package by.htp.les07.main;

public class Main17 {
	// 17.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	// Вокруг еденицы, в нутри все нули.
	public static void main(String[] args) {
		int n = 8;
		int[][] mas = new int[n][n];

		init(mas);
		printMas(mas);
	}

	public static void init(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			if (i == 0 || i == mas.length - 1) {
				for (j = 0; j < mas[i].length; j++) {
					mas[i][j] = 1;
				}
			} else {
				for (j = 0; j < mas[i].length; j++) {
					if (j == 0 || j == mas.length - 1) {
						mas[i][j] = 1;
					} else {
						mas[i][j] = 0;
					}
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