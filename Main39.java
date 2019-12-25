package by.htp.les07.main;

import java.util.Random;

public class Main39 {

	public static void main(String[] args) {
		// 39. Найдите произведение двух матриц.
		int[][] mas1 = new int[5][3];
		int[][] mas2 = new int[3][5];

		init(mas1, 30);
		init(mas2, 30);

		printMas(mas1);
		printMas(mas2);
		printMas(multiplyMas(mas1, mas2));
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

	public static int[][] multiplyMas(int[][] mas1, int[][] mas2) {
		int i;
		int j;
		int k;
		int temp;
		int[][] multiplyMas = new int[mas1.length][mas2[0].length];

		for (i = 0; i < multiplyMas.length; i++) {
			for (j = 0; j < multiplyMas[i].length; j++) {
				temp = 0;
				for (k = 0; k < mas1[0].length; k++) {
					temp = temp + (mas1[i][k] * mas2[k][j]);
				}
				multiplyMas[i][j] = temp;
			}
		}
		return multiplyMas;
	}

	public static void printMas(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.printf("% 5d ", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}