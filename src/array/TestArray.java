package array;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// # 陣列
//		int[] ages = new int[10];
		int[] ages = { 13, 1, 13, 54 };
		ages[0] = 1;
		ages[1] = 2;
		ages[2] = 3;

		System.out.printf("ages[0]=%d%n", ages[0]);
		// 賦值和取值都是用單一位置, 0起算
		System.out.printf("長度:%d%n", ages.length);
		// System.out.println(ages[55]);
		// //超出陣列個數java.lang.ArrayIndexOutOfBoundsException: 55
		System.out.printf("ages[3]=%d%n", ages[3]);
		// 預設值

		// #二維陣列
		
		// int[][] x = new int[5][4];
		int[][] x = { { 1, 2, 3 }, { 4, 5 }, { 7, 8, 9 } };
		x[0][0] = 1;
		x[1][1] = 2;
		x[2][2] = 3;
		System.out.println("x[2][2]= " + x[2][2]);
		System.out.printf("x.length 陣列有幾排: %d%n", x.length);
		System.out.printf("x[].length 陣列中第幾2排有幾個: %d%n", x[2].length);

		// 二維陣列迴圈
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.printf("x[%d][%d]=%d%n", i, j, x[i][j]);
			}
		}

		// for each迴圈 for(宣告:陣列)
		// 宣告型態取決於陣列是什麼型態
		for (int value : ages) {
			System.out.println(value);
		}

		// 二維 for each迴圈
		for (int[] row : x) {
			for (int value : row) {
				System.out.println(value);				
			}
		}
		
		
	}
}
