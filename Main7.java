package by.htp.les07.main;

import java.util.Random;

public class Main7 {

	public static void main(String[] args) {
		// 7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
		// элементов.
		int[][] mas = new int[5][5];

		randomNumber(mas);
		printMas(mas);
		sumNumber(mas);

	}

	public static void sumNumber(int[][] mas) {
		System.out.println();
		int a = 0;
		int b = 0;
		int sum;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				a = mas[i][j];
				if (a % 2 != 0) {
					b = b + a;
				}
			}
		}
		System.out.println("Cумму модулей отрицательных нечетных элементов = " + b);
	}

	public static void randomNumber(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10) * (-1);
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