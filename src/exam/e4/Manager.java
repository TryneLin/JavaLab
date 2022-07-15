package exam.e4;

public class Manager extends Employee{
	
	private long bonus;

	public Manager(int empno, String name, long salary, long bonus) {
		super(empno, name, salary);
		this.bonus = bonus;
	}

	public long getBonus() {
		return bonus;
	}

	public void setBonus(long bonus) {
		this.bonus = bonus;
	}

	@Override
	public long getSalary() {
		// TODO Auto-generated method stub
		
		return super.getSalary()+bonus;
	}
	
	
	

	
	
}
