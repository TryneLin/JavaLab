package equals;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("001");
		Employee e2 = new Employee("001");
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));

		System.out.println(e2);
		
		e1 = null;
		// 清除最後資源,關閉檔案或資料庫連線等, 很少用到, 通常有其他方法可以達成相同目的
		System.gc();
	}


		
	
}
