package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet 無序 v.s. LinkHasgSet 有序 v.s. Treeset 可指定序
		Set<String> set = new LinkedHashSet<String>();
		set.add("Hello");
		set.add("Hello");
		System.out.println("目前set大小="+set.size());
		
		boolean success = set.add("Hello");
		System.out.println("再加一次Hello有成功嗎: "+success);
		// 重複資料加入失敗
		
		set.add("World");
		System.out.println("目前set大小="+set.size());
		
		// contains 包含
		boolean helloExist = set.contains("Hello");
		System.out.println("Hello有包含嗎:"+helloExist);
		
		// 泛型後不可加入非String資料
		//set.add(3);
		
		//顯示順序與加入順序無關
		for ( String item : set) {
			System.out.printf("%s %n",item);

		}
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		}
	
	}

}
