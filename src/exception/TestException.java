package exception;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		int a=1;
		int c=1;
		System.out.println("c="+c--);
		
		int b=a/c; //c--=0, a/0 ->無限大, 無法處理而當機
		System.out.println("b="+b);
		int[] ages = {}; //產生空陣列
		System.out.println(ages[0]);
		
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			// TODO: handle exception
			//處理exception
			System.out.println("除到0了");
			// 印出錯誤在哪裡
			ex.printStackTrace();
		
			// 攔截所有exception, 使用所有exception的父類別Exception
		}catch (Exception ex) {
			ex.printStackTrace();
			// TODO: handle exception

		}finally {
			System.out.println("finally一定會被執行,常用來關閉檔案或中斷資料庫連線");
		}
		
		// 有正確攔下exception,則程式繼續執行
		System.out.println("done");
		
	}

}
