import category.Item;
// 可直接import package做引用, 下面class就不需要全名
// 也可以在下方宣告class變數的時候, 利用工具直接帶入import

public class TestPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item item = new Item(); //
		category.Item item2 = new Item();
		// ↑沒有import的話就要這樣用全名
		// 使用時要用到全名, 包含package.class name
		// 可以有很多層, 一直上層package.中層package.目的地package.class name下去
		
		item.name = "ASUS notebook";
		System.out.println("TestPackge's main:" + item.name);
		 
		
	}

}
