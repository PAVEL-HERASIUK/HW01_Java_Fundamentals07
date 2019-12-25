package by.htp.les07.main;

import java.util.Random;

public class Main36 {

	public static void main(String[] args) {
		// 36. Операция сглаживания матрицы дает новую матрицу того же размера, каждый
		// элемент которой получается как среднее арифметическое соседей соответствующего
		// элемента исходной матрицы. Построить результат сглаживания заданной матрицы
		int n = 5;
		int[][] mas = new int[n][n];

		init(mas, 50);
		printMas(mas);

		printNewMas(smoothingMas(mas));
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

	public static double[][] smoothingMas(int[][] mas) {
		int i;
		int j;
		double[][] mas2 = new double[mas.length][mas[0].length];

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				mas2[i][j] = createNewElement(mas, i, j);
			}
		}
		return mas2;
	}

	public static double createNewElement(int[][] mas, int i, int j) {
		int k;
		int l;
		int element = 0;
		int counter = 0;

		for (k = i - 1; k <= i + 1; k++) {
			if (k >= 0 && k < mas.length) {
				for (l = j - 1; l <= j + 1; l++) {
					if (k != i || l != j) {
						if (l >= 0 && l < mas[k].length) {
							element = element + mas[k][l];
							counter++;
						}
					}
				}
			}
		}
		return (double) element / counter;
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

	public static void printNewMas(double[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.printf(" % 7.2f ", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
