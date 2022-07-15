package func;

public class TestFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s = add(2, 54);
		// shift+ alt+ l 呼叫自動生成區域變數
		System.out.println("Done: "+s);
	}

	//方法定義 
	//公開存取      回傳型態 方法名稱 input參數(型態 變數名稱) 也是區域變數
	public static int  add   (int a, int b) {
		int sum = a + b;
		System.out.println("Sum= " +sum);
		return sum;
	}
	
	
	
}
