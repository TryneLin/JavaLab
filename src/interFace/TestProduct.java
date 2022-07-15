package interFace;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int a ;
		int x=0;
		a = x+3;
		x= 7;
		
		Notebook nb = new Notebook("Asus",20000,365);//0800
		/*
		System.out.printf("名稱: %s, 價錢: %d,保固天數: %d %n",nb.name,nb.price,nb.warranty);
		System.out.println(nb.name);
		System.out.println(nb.desc());
		*/
		Notebook nb1 = new Notebook("Abc",0,5);
		
		Product item = nb; // item =0800
		// item = nb(Notebook, 而Notebook是Product的一種)
		// 使用父類別的型態, 父類別的方法, 操作子類型物件(Notebook)所以實際呼叫的是子類別方法
		System.out.println(item.desc());
		
		// 檢查物件可用型態 instanceof, ex. 如果item 是Notebook的一種-> True
		System.out.println(item instanceof Product);
		System.out.println(item instanceof Notebook);
		System.out.println(item instanceof Food);

		// 檢查後可強制轉型, 
//		Notebook item3 = item; // Pproduct 是不是 Notebook?
		Notebook item3 = (Notebook)item; // 保證 Pproduct 一定是 Notebook
//		Food item5 = (Food)item; // 保證 Pproduct 一定是 Notebook
		
		
		// Date取得方式: 先知道要用哪一種日曆
		GregorianCalendar calendar = new GregorianCalendar(2022, 3, 17);//月份由0起算
		GregorianCalendar calendar1 = new GregorianCalendar(2022, Calendar.JANUARY, 17);//月份由0起算,或是用Calendar指定月份
		//日曆 ->日期, 用java.util.Date, 不是java.sql.Date
		Date expireDate = calendar.getTime();
		Date expireDate1 = calendar1.getTime();
		
		Food food = new Food("肉鬆", 100, expireDate);
		Food food1 = new Food("魚鬆", 100, expireDate1);
		System.out.println(food.desc());
		System.out.println(food1.desc());
		
		calendar = new GregorianCalendar(2022, 3, 30);
		expireDate = calendar.getTime();
		SimCard sim = new SimCard("日本漫遊", 700, 7, expireDate);
		
		Product[] ps = {nb, food, sim};
		buy(ps);
		/*
		buy(food);
		buy(nb);
		*/
	}
	/*
	public static void buy(Notebook nb) {
		System.out.println("買入"+nb.desc());
	}
	public static void buy(Food food) {
		System.out.println("買入"+food.desc());
	}
	*/
	
	
	// 多型運用
	public static void buy(Product[] products) {
		// for each 迴圈, 冒號前的變數型態, 取決方法參數的第一個資料型態(Product[])
		int sum = 0;
		for (Product item : products) {
			if ( item instanceof Expirable) {
			// 如果item有expeirable的型態,表示有會過期的特性
			// 需要取得最後期限	
				Expirable exp = (Expirable)item;
				//強制轉型成Expirable並呼叫最後期限()
				Date lasDate = exp.最後使用期限();
				Date now = new Date();//產生現在電腦時間
				if (lasDate.before(now)) {
					System.out.println("排除"+item.desc()+",過期了!!");
					continue;//跳過結帳迴圈, 不加入結帳計算
					
				}
			}
			System.out.println("買入"+ item.desc());
			sum += item.getPrice();
		}
		System.out.println("總金額: "+sum);
	}
}
