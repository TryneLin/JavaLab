
public class TestDebug {

	public static void main(String[] args) {

		int b = 2100000000 + 2100000000;
		System.out.println(b);
		// overflow 資料溢位 不會顯示為錯誤! 最危險, 在python當中也是

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "x" + j + "=" + i * j + "\t"); // ln for line換行
// F6 執行中斷點
			}
			System.out.println();
		}
		
	}

}
