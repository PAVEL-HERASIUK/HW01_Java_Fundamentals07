package by.htp.les07.main;

import java.util.Random;

public class Main37 {

	public static void main(String[] args) {
		// 37. Переставить строки матрицы случайным образом.

		int n = 5;
		int[][] mas = new int[n][n];

		init(mas, 50);
		printMas(mas);

		changeLines(mas);
		printMas(mas);
	}

	public static void init(int[][] mas, int limit) {
		int i;
		int j;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(limit);
			}
		}
	}

	public static void changeLines(int[][] mas) {
		int[] temp;

		temp = mas[0];
		Random rand = new Random();
		System.out.println("-------------------");
	}

	public static void printMas(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.printf("% 3d ", mas[i][j]);
			}
			System.out.println();
		}
	}
}