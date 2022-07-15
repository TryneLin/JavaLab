package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//用ArrayList list = new ArrayList();也可以
		//只是實務常用List介面
		
		// <資料型態>  泛型 (其實前面<>定資料型態後, new後面的<>就不用
		List<String> list = new ArrayList<String>();
		
		//加入資料必須是物件,不可以是基本型態
		list.add("Hello"); //index[0]
		list.add("World"); //index[1]
		// 3 為int 基本型態, 不是class也就不是物件
		
		// 泛型指定 String後, 後面不能加入 非String的資料
		//list.add(3); //index[2]
		
		
		/* 基本型態與物件轉換
		Integer a = new Integer(3); //boxing 將值包裹進物件中
		int x = a.intValue();// unboxing 取出物件中的值
		list.add(new Integer(3)); //java autoboxing		
		->  list.add(3); 
		*/
		
		System.out.println("list[0]= "+list.get(0));
		System.out.println("list[1]= "+list.get(1));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("list[%d]= %s%n",i,list.get(i));
		}

		//list大小
		System.out.println("目前list大小= "+list.size());
		
		// 基本型態與物件轉換
		String s = "3";
		System.out.println(s+1);
		int sint = Integer.parseInt(s); //文字轉成基本型態
		//double.parseDouble(s);
		//float.parseFloat(s);
		
		//Iterator Iterable下的類別
		//Iterator it = list.iterator();
		
		//泛型 自動宣告變數也會自動加上String, while中也不需要用object,直接用String即可
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String item = it.next();
			System.out.println(item);

		System.out.println(list.contains(3));	
			
		}
		
	}

}
