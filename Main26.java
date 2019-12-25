package by.htp.les07.main;

import java.util.Scanner;

public class Main26 {

	public static void main(String[] args) {
		// 26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить
		// с массивом следующие действия:
		// а) вычислить сумму отрицательных элементов в каждой строке;
		// б) определить максимальный элемент в каждой строке;
		// в) переставить местами максимальный и минимальный элементы матрицы.
		double[][] mas = createMas();
		double[] sum;
		double indexesOfMax;

		initConsole(mas);
		printMas(mas);
		sum = countSumOfNegativeElementsInLine(mas);
		printSums(sum);
		indexesOfMax = findMaxElementInLine(mas);

		printMax(indexesOfMax, mas);
		changeMaxAndMinElements(mas);
		printMas(mas);
	}

	@SuppressWarnings("resource")
	public static double[][] createMas() {
		int n;
		int m;

		Scanner sc = new Scanner(System.in);
		System.out.println(" Введите размер массива ");
		System.out.println(" Введите количество строк n: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(" Введено неофициальное число, чешский ввод ");
		}
		n = sc.nextInt();

		System.out.println(" Введите количество столбцов m: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(" Введено неофициальное число, чешский ввод ");
		}
		m = sc.nextInt();

		double[][] mas = new double[n][m];
		return mas;
	}

	@SuppressWarnings("resource")
	public static void initConsole(double[][] mas) {
		int i;
		int j;

		Scanner sc = new Scanner(System.in);
		System.out.println(" Введите элементы массива: ");
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.println(" mas [ " + i + " ] [ " + j + " ] = ");
				mas[i][j] = sc.nextDouble();
			}
		}
	}

	public static double[] countSumOfNegativeElementsInLine(double[][] mas) {
		int i;
		int j;
		double sum = 0;
		double[] sums = new double[mas.length];

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0) {
					sum = sum + mas[i][j];
				}
			}
			sums[i] = sum;
		}
		return sums;
	}

	public static double findMaxElementInLine(double[][] mas) {
		int i;
		int j;
		double max;
		int index = 0;
		int[] indexes = new int[mas.length];

		for (i = 0; i < mas.length; i++) {
			max = mas[i][0];
			index = 0;
			for (j = 1; j < mas[i].length; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
					index = j;
				}
			}
			indexes[i] = index;
		}
		return index;
	}

	public static void changeMaxAndMinElements(double[][] mas) {
		int i;
		int j;
		double temp;
		double max = mas[0][0];
		double min = mas[0][0];
		int[] indexOfMax = new int[] { 0, 0 };
		int[] indexOfMin = new int[] { 0, 0 };

		for (i = 0; i < mas.length; i++) {
			for (j = 1; j < mas[i].length; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
					indexOfMax[0] = i;
					indexOfMax[1] = j;
				}
				if (mas[i][j] < min) {
					min = mas[i][j];
					indexOfMin[0] = i;
					indexOfMin[1] = j;
				}
			}
		}
		temp = mas[indexOfMax[0]][indexOfMax[1]];
		mas[indexOfMax[0]][indexOfMax[1]] = mas[indexOfMin[0]][indexOfMin[1]];
		mas[indexOfMin[0]][indexOfMin[1]] = temp;
	}

	public static void printMas(double[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.printf("% 7.2f ", mas[i][j]);
			}
			System.out.println();
		}
	}

	public static void printSums(double[] mas) {
		int i;

		System.out.println(" Сумма отрицательных элементов: ");
		for (i = 0; i < mas.length; i++) {
			System.out.printf(" В строке% 2d:% 7.2f ", i, mas[i]);
			System.out.println();
		}
	}

	public static void printMax(double indexesOfMax, double[][] mas) {
		int i;
		System.out.println(" Максимальный элемент: ");
		for (i = 0; i < mas.length; i++) {
			int[] indexes = null;
			System.out.printf(" В строке% 2d:% 7.2f ", i, mas[i][indexes[i]]);
			System.out.println();
		}
	}
}
