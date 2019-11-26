package by.htp.les07.main;

import java.util.Random;

public class Main9 {

	public static void main(String[] args) {
		// 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

		int[][] mas = new int[5][5];

		randomNumber(mas);
		printMas(mas);

		diagonalMas(mas);
	}

	public static void diagonalMas(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i][i]);
		}
	}

	public static void randomNumber(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(15);
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
		System.out.println("....................");
	}
}