package exam.e5;

import java.util.ArrayList;
import java.util.List;

import extend.Notebook;

public class ShoppingCart {
	public static void main(String[] args) {

		// 實作1.加入二台Notebook("Asus",30000),Notebook("Acer",20000),Food("Cookie",200)到shoppingList中
		List<Product> shoppingList = new ArrayList<Product>();
		shoppingList.add(new exam.e5.Notebook("Asus", 30000));
		shoppingList.add(new exam.e5.Notebook("Acer", 20000));
		shoppingList.add(new exam.e5.Food("Cookie", 200));

		//System.out.println(product.desc());
		
		// 實作2.利用for迴圈，計算shoppingList中的總金額,並印在Console中
		int sum = 0;
		for (Product product : shoppingList) {
			//System.out.println(product.desc());
			sum = sum + product.getPrice();

		}
		System.out.println("總金額: " + sum);

		// 實作3.利用for迴圈，計算shoppingList中是Notebook型態的總金額,並印在Console中
		int nsum = 0;
		for (Product product : shoppingList) {
			if (product instanceof exam.e5.Notebook) {
				//System.out.println(product.desc());
				nsum = nsum + product.getPrice();
			}
		}
		System.out.println("Notebook總金額: " + nsum);

	}
}
