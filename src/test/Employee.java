package test;

public class Employee {
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		int age = 18;
		Employee emp = new Employee("Vincent");
		Employee emp2 = new Employee("Vincent");
		
		 System.out.println(emp == emp2);
		 System.out.println(emp.equals(emp2));
		
		System.out.println(age);
		System.out.println(emp);
		System.out.println(emp2);

		// I.  age變數在記憶體中的值是多少? 18
		// II. emp變數在記憶體中的值是多少? 記憶體位址id=100
		// III. emp2變數在記憶體中的值是多少? 記憶體位址id=110
		// IV. 上面兩個記憶體區塊，那一個是heap那一個是stack? heap: Employee(Vincent), Employee(David) / stack: age,emp,emp2
		
	
	}

}
