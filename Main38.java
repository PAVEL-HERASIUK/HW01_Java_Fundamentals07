package by.htp.les07.main;

import java.util.Random;

public class Main38 {

	public static void main(String[] args) {
		// 38. Найдите сумму двух матриц

		int[][] mas1 = new int[4][5];
		int[][] mas2 = new int[4][5];

		init(mas1, 20);
		init(mas2, 20);

		printMas(mas1);
		printMas(mas2);
		printMas(sumMas(mas1, mas2));
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

	public static int[][] sumMas(int[][] mas1, int[][] mas2) {
		int i;
		int j;
		int[][] sumMas = new int[mas1.length][mas1[0].length];

		for (i = 0; i < sumMas.length; i++) {
			for (j = 0; j < sumMas[i].length; j++) {
				sumMas[i][j] = mas1[i][j] + mas2[i][j];
			}
		}
		return sumMas;
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
		System.out.println();
	}
}