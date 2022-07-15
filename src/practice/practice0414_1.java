package practice;

public class practice0414_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 判斷101-200之間有多少個質數，並輸出所有質數。
		// 素數是：只能被1或本身整除的數，如：3,5,7,11,131...
		// 可以寫出來但是順序不對, 會先列出所有質數再計算數量
		
		
		int sumj = 0;
		int sumi = 0;
		for (int i = 101; i < 200; i++) {
			sumj = 0;
			for (int j = 2; j < i; j++) {
				if ((i % j) == 0) {
					continue;
				} else {
					sumj += 1;
				}
			}
			if ((sumj + 2) < i) {
				continue;
			} else {
				sumi += 1;
				System.out.println(i);
			}
		}
		System.out.println("質數總共有: " + sumi + " 個");
		
		
		
	}

}
