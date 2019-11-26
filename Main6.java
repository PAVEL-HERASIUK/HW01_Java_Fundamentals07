package by.htp.les07.main;

import java.util.Random;

public class Main6 {

	public static void main(String[] args) {
		// 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый
		// элемент больше последнего.

		int[][] mas = new int[10][10];

		randomNumber(mas);
		printMas(mas);

		printColumn(mas);
	}

	public static void printColumn(int[][] mas) {
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j % 2 == 0) {
					if (mas[0][j] > mas[mas[i].length][j]) {
						System.out.printf("% 3d ", mas[i][j]);
					}
				}
			}
			System.out.println();
		}
	}

	public static void randomNumber(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(50);
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