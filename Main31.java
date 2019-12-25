package by.htp.les07.main;

import java.util.Random;

public class Main31 {

	public static void main(String[] args) {
		// 31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать
		// количество двузначных чисел в ней.

		int[][] mas = new int[10][10];

		init(mas, 999);
		printMas(mas);

		print(countDoubleDigit(mas));
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

	public static int countDoubleDigit(int[][] mas) {
		int i;
		int j;
		int count = 0;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > 9 && mas[i][j] < 100) {
					count++;
				}
			}
		}
		return count;
	}

	public static void printMas(int[][] mas) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				System.out.printf("% 4d ", mas[i][j]);
			}
			System.out.println();
		}
	}

	public static void print(int value) {
		System.out.printf(" Количество двузначных чисел: " + value);
	}
}
