
public class TestIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 15;
		if (age >= 18) {
			if (age >= 30) {
				if (age >= 18) {
					System.out.println("老年");
				} else {
					System.out.println("壯年");
				}
			} else {
				System.out.println("成年");
				// 前面條件符合後, 就不往後判斷
			}
			System.out.println("未成年");
		}

		// # switch
		int classroom = 201;
		// tab: 往下一個框移動 shift+tab: 往上一個框移動
		switch (classroom) {
			case 204:
				System.out.println("30人<=人數");
				break; // 每個case結尾都要有break
	
			case 305:
				System.out.println("20人<人數<=30人");
				break;
	
			default:
				System.out.println("其他情況");
				break;
		}

	}

}
