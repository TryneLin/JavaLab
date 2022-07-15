package array;

public class TestEmployeeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] emps = new Employee[2];//0800
		
		/*
		Employee emp1 = new Employee();// 0900
		emp1.empno = 1; //0900.empno
		emp1.name= "Vincent"; // 0900.name
		emps[0] = emp1;//放進陣列 0800[0]=0900
		*/
		
		emps[0] = new Employee();
		emps[0].empno = 1;
		emps[0].name = "Vincent";
		//和上方寫法相同且更常見
		
		System.out.println(emps[0].name);
		// 如果不明白印出來的值的來源, 可以用debug看
		
		emps[1] = new Employee();
		emps[1].empno = 2;
		emps[1].name = "David";
		System.out.println(emps[1].name);
		
	    for (int i = 0; i < emps.length; i++) {
	    	
	    	if (emps[i] == null) {
				continue;
			// 防止範圍內有中空值
			}
	    	
	    	System.out.printf("編號: %d, 名字: %s%n",emps[i].empno,emps[i].name);
		}
	    
	   
		
			
		
		
		
		
	}

}
