package by.htp.les07.main;

import java.util.Random;

public class Main11 {

	public static void main(String[] args) {
		// 11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке:
		// первая
		// строка справа налево, вторая строка слева направо, третья строка справа
		// налево и так далее.

		int[][] mas = new int[3][3];

		randomNumber(mas);
		printMas(mas);

		printLine(mas);
	}

	public static void printLine(int[][] mas) {
		System.out.println();
		for (int i = mas.length + 1; i >= 0; i++) {
			System.out.printf("% 3d ", mas[0][i]);
		}
		System.out.println();
		for (int i = 0; i < mas.length + 2; i++) {
			System.out.printf("% 3d ", mas[1][i]);
		}
		System.out.println();
		for (int i = mas.length + 1; i >= 0; i++) {
			System.out.printf("% 3d ", mas[2][i]);
		}
	}

	public static void randomNumber(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
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