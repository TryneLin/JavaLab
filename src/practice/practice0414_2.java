package practice;

public class practice0414_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 題目：打印出所有的"水仙花數"，所謂"水仙花數"是指一個三位數，其各位數字立方和等於該數本身。
		// 例如：153是一個"水仙花數"，因為153=1的三次方＋5的三次方＋3的三次方。
		
		for (int i = 152; ; i++) {
			if ( (double)i == ((Math.pow(i%1000/100,3))
					          +(Math.pow(i%100/10,3))
					          +(Math.pow(i%10,3)))) {
				System.out.println(i);
				
			}
		}
	}
}
