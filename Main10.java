package by.htp.les07.main;

import java.util.Random;
import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {

		// 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

		int p, k;

		k = enterNumber("Укажите номер строки");
		p = enterNumber("Укажите номер столбца");

		int[][] mas = new int[7][7];

		randomNumber(mas);
		printMas(mas);

		lineMas(mas, k);
		columnMas(mas, p);
	}

	public static void lineMas(int[][] mas, int k) {
		System.out.println();
		int a;
		for (int i = 0; i < mas.length - 1; i++) {    //здесь был (+) в length+1 и выдавало ошибку выхода за пределы индекса массива
			a = mas[k - 1][i];
			System.out.printf("% 3d ", a);
		}
		System.out.println();
	}

	public static void columnMas(int[][] mas, int p) {
		System.out.println();
		int a;
		for (int i = 0; i < mas.length; i++) {
			a = mas[i][p - 1];
			System.out.printf("% 3d ", a);
			System.out.println();
		}
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
