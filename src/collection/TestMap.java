package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hashmap 無序 v.s. LinkHasgmap 有序 v.s. Treemap 可指定序
		Map<String, Integer> map = new HashMap();
		
		// 賦值用put
		map.put("John",  2000);
		map.put("David", 1000);
		map.put("Tom",   5000);

		System.out.println("Tom's 薪水= "+map.get("Tom"));
		
		// 同一key值有不同資料, 後面覆寫前面
		map.put("Tom",   2500);
		
		// 取值只需要key
		System.out.printf("Tom's 薪水= %d %n",map.get("Tom"));
		
		// keyset()
		
		Set<String> keys = map.keySet();
		int sum=0;
		for (String key : keys) {
			System.out.println("name= "+key+",salary= "+map.get(key));
			
			//泛型後不需要轉型, 可以直接宣告
			Integer salary = map.get(key);
			//Integer value = map.get(key);
			//Integer salary = (Integer)value;

			sum += salary;// 實際執行 sum += salary.integer()  [auto unboxing]
			//sum = sum + (int)map.get(key); 使用泛型的話,就不需要轉型
		}
		System.out.println("薪水總和= "+sum);
		
		
		
	}

}
