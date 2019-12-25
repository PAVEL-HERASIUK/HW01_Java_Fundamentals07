package by.htp.les07.main;

public class Main16 {

	public static void main(String[] args) {
		// 16. Сформировать квадратную матрицу порядка n по заданному образцу
		//(n - четное): 1*2, 2*3, 3*4... n(n- 1), n(n+ 1)
		// По диагонали слево напрова вниз.
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
				if (i == j) {
					mas[i][j] = (i + 1) * (i + 2);
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
