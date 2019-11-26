package by.htp.les07.main;

import java.util.Random;

public class Main4 {

	public static void main(String[] args) {
		// 4. Дана матрица. Вывести на экран первую и последнюю строки.

		int[][] mas = new int[10][10];

		randomNumber(mas);
		printMas(mas);

		printFirstString(mas);
		printLastString(mas);

	}

	public static void printFirstString(int[][] mas) {

		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == 0) {
					System.out.printf("% 3d ", mas[i][j]);
				}
			}
		}
	}

	public static void printLastString(int[][] mas) {

		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == (mas[i].length - 1)) {
					System.out.printf("% 3d ", mas[i][j]);
				}
			}
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