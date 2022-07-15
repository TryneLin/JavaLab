import javax.sound.midi.Soundbank;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Vincent"; //在string pool中新增記憶體0800
		String name1 = "Vincent"; // 直接飲用0800
		System.out.println(name==name1);// 0800 == 0800
		
		String name2 = new String("Vincent");
		// 不在string pool中引用, 直接產生一個新的記憶體位址0900
		System.out.println(name==name2);// 0800 == 0900
		System.out.println(name.equals(name2));// 字串內容比較
		
		// string常用方法(函數)
		System.out.println("A".equals("a"));// 字串內容比較
		System.out.println("length= "+ name.length());
		System.out.println("indexOf= "+ name.indexOf("i") );
		System.out.println("indexOf= "+ name.indexOf("o") +" 如果不存在");// 從0起算, 找不到為-1
		System.out.println("substring= "+ name.substring(2));//指定開址位置,包含開始字元
		System.out.println("substring= "+ name.substring(2,5));//指定結束位置,不包含最後字元
		
		double price = 123.4567;
		System.out.println(String.format("水果:%07.2f元,%n賣給%s的時候,可以賣%04d元或是95%%", price,name,(int)price));
		System.out.printf("水果:%7.2f元,%n賣給%s的時候,可以賣%04d元或是售價的95%%", price,name,(int)price);
		// 兩種寫法相同
		System.out.println(100);
		// printf不會自動換行, 後面要再加%n
	
		
		
	}

}
