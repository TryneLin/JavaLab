package equals;

import java.util.Objects;

public class Employee {
	
	private String id;

	public Employee(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// 先過濾obj為Employee才有比較意義
		if (obj instanceof Employee) {
			// 強制轉型, Object中沒有id屬性可以比較
			Employee emp = (Employee)obj;
			// 比較id一樣時回傳true
			if (this.id.equals(emp.id)) {
			return true;	
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// 將屬性轉換為數字
		return Objects.hash(id);
	}
	
	// 清除最後資源,關閉檔案或資料庫連線等, 很少用到, 通常有其他方法可以達成相同目的
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Employee "+id+"要被GC了!!!");;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("員工(%s)",id);
	}
	
	
	
}
