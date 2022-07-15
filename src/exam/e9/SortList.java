package exam.e9;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        Employee e1 = new Employee("001",10000,300);
        Employee e2 = new Employee("002",10000,200);
        Employee e3 = new Employee("003",20000,200);
        Employee e4 = new Employee("004",30000,200);

        List<Employee> list = Arrays.asList(e1, e2, e3, e4);
        //請利用List中的sort方法重新排序e1..e4，排序時薪水(salary)大的排前面，如果薪水一樣則commission小的排前面

        System.out.println(list);

        int sal =0 ;
        int com = 0;
        for (Employee employee : list) {
        	if  (sal < employee.getSalary()) {
        		System.out.println(-1);
        		sal = employee.getSalary();
        		com = employee.getCommission();
        	}else if (sal > employee.getSalary()) {
        		System.out.println(11);
        		sal = employee.getSalary();
        		com = employee.getCommission();
			}else {
				if (com < employee.getCommission()) {
					System.out.println(-1);
	        		sal = employee.getCommission();
				}else if (com > employee.getCommission()) {
					System.out.println(1);
	        		sal = employee.getCommission();
					
				}else {
					System.out.println("真的一模一樣啦");
				}
			}
			
		}
        
    }
}
