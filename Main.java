package by.htp.les07.main;

public class Main {

	public static void main(String[] args) {
		// // 1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной
		// строке была ровно одна единица, и вывести на экран.

		int[][] mas = new int[3][4];

		fillingMas(mas);
		printMas(mas);
	}

	public static void fillingMas(int[][] mas) {
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			j = mas.length;
			mas[i][j] = 1;
		}
	}

	public static void printMas(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("% 3d ", mas[i][j]);
			}
			System.out.println();
		}
	}
}