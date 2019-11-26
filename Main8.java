package by.htp.les07.main;

import java.util.Random;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		// 8. Составить программу, которая в массиве A[N] находит второе по величине
		//    число (вывести на печать число, которое меньше максимального элемента массива, но
		//    больше всех других элементов).

		int n;
		int m;

		n = enterNumber("Укажите количество строк в массиве");
		m = enterNumber("Укажите количество столбцов в массиве");

		int[][] mas = new int[n][m];

		randomNumber(mas);
		printMas(mas);

		finderSeven(mas);
	}

	public static void finderSeven(int[][] mas) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				a = mas[i][j];
				if (a == 7) {
					b++;
				}
			}
		}
		System.out.println("..............................");
		System.out.println("Число  7  встречается " + b + " раз");
	}

	public static int enterNumber(String mesage) {
		int value;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println(mesage);

		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println(mesage);
		}
		value = scan.nextInt();
		return value;
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
	}
}