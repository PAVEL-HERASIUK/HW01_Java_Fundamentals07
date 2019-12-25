package by.htp.les07.main;

public class Main12 {

	public static void main(String[] args) {
		// 12. Получить квадратную матрицу порядка n:
		//  int[][] mas = new int[10][10]; 
		//  Где по диагонали 0,1,2,3...0; А по боках вроде все нули. 
		int n =  10 ;
		int [] [] mas =  new  int [n] [n];

		init (mas);
		printMas (mas);
	}

	public  static  void  init ( int [] [] mas ) {
		int i;
		int j;
		for (i =  0 ; i < mas . length; i ++ ) {
			for (j =  0 ; j < mas [i] . length; j ++ ) {
				if (i == j) {
					mas [i] [j] = i;
				} else {
					mas [i] [j] =  0 ;
				}
			}
		}
	}

	public  static  void  printMas ( int [] [] mas ) {
		int i;
		int j;
		for (i =  0 ; i < mas . length; i ++ ) {
			for (j =  0 ; j < mas [i] . length; j ++ ) {
				System.out.printf ("% 2d " , mas [i] [j]);
			}
			System.out.println ();
		}
	}
}