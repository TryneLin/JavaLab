
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		System.out.println(a);
		
		Employee emp = new Employee(); // 取得記憶體位址ex. 0800
		// 產生物件, 有new就會在記憶體中產生新物件Employee,
		// 能放的資料數決定於class中的定義(以Employee.java為2格)
		emp.empno = 1; // 0800.empno = 1
		emp.name = "Vincent";
		System.out.println("員工編號:" + emp.empno + ", 名字:" + emp.name);

		Employee emp2 = new Employee(); // 取得記憶體位址ex. 0801
		emp2.empno = 2;
		emp2.name = "David";
		System.out.println("員工編號:" + emp2.empno + ", 名字:" + emp2.name);

		System.out.println(emp == emp2); // 比較記憶體位址 0800 == 0801 -> False

		emp2 = emp; // emp2 = 0800
		System.out.println("員工編號:" + emp2.empno + ", 名字:" + emp2.name);
		System.out.println(emp == emp2); // 比較記憶體位址 0800 == 0800 -> Ture

		// # null
		emp = null; // 清空heap區記憶體位址, 後續被GC
		emp2 = null;
		System.out.println(emp);
		System.out.println(emp2);
		System.out.println(emp=emp2);
		//a = null //只有物件形式變數可以使用null, 一般變數不可以 
		System.out.println(emp.empno);// NullPointerException 如果屬性變數被清空, 則變數不能再使用
		
		
	}
}
