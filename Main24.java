package by.htp.les07.main;

public class Main24 {

	public static void main(String[] args) {
		// 24. Дан линейный массивn x1 , x2 , , x , xn-1,xn. N - внизу.
		// Получить действительную квадратную матрицу порядка n:
		
		int[] mas1 = new int[] { 1, 2, 3, 4, 5, 6 };
		int[][] mas2 = new int[mas1.length][mas1.length];

		init(mas1, mas2);
		printMas(mas2);
	}

	public static void init(int[] mas1, int[][] mas2) {
		int i;
		int j;
		for (i = 0; i < mas2.length; i++) {
			for (j = 0; j < mas2[i].length; j++) {
				mas2[i][j] = (int) Math.pow(mas1[j], i + 1);
			}
		}
	}

	public static void printMas(int[][] mas) {
		int i;
		int j;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.printf("% 6d ", mas[i][j]);
			}
			System.out.println();
		}
	}
}
