
public class TestLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for (計數器宣告; 判斷條件; 次數控制)
		for (int i = 1; i <= 10; i++) {

			System.out.println(i);
			// i++;//計數器+1,通常放在次數控制
		}

		// System.out.println("last i is "+i);在迴圈內宣告的變數, 只能在迴圈內使用

		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum = sum + i;

		}
		System.out.println("總和= " + sum);

		// if else作法
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 != 0) {
				sum2 = sum2 + i;

			} else {
				sum2 = sum2; // 這行其實不需要,只是讀起來比較完整
			}
		}
		System.out.println("奇數總和= " + sum2);

		// i+=2作法
		int sum3 = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum3 = sum3 + i;
		}
		System.out.println("奇數總和= " + sum3);

		// 三元運算作法
		int sum4 = 0;
		for (int i = 1; i <= 100; i++) {
			sum4 = sum4 + (i % 2 == 0 ? 0 : i);
		}
		System.out.println("奇數總和= " + sum4);

		// continue作法
		int sum5 = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				continue; //迴圈跳過
			}
			if (i >=50) {
				break; //迴圈中斷
			}
			sum5 = sum5 + i;
		}
		System.out.println("奇數總和= " + sum5);
		
		// # while(){} 迴圈
		int counter = 0;
		int sumOfWhile = 0;
		while (counter <=100) {
			sumOfWhile += counter;
			counter++;
		}
		System.out.println("While總和= " +sumOfWhile);

		// # do{}while() 迴圈, 就算一開始就不符合while條件, 還是會執行一次do
		int i = 200;
		sum = 0; // 重複使用相同變數, 不宣告, 重新賦值
		do {
			sum += i;
			i++;
			
		} while (i <= 100);
		
		System.out.println("DoWhile總和= " +sum);
		System.out.println(i);

	}

}
