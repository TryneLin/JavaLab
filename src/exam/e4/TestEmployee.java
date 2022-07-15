package exam.e4;

public class TestEmployee  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee(001,"Alan", 1000);
		Manager emp2 = new Manager(002, "Ben", 5000, 500); 
		
		System.out.println(emp1.desc());
		System.out.println(emp2.desc());
		
	}

}
