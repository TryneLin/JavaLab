package func;

public class TestPeople {
	
	public static void main(String[] args) {
		
		People p = new People();
		p.height = 1.7;
		p.weight = 69;
		double bmi = p.getBMI();
		System.out.printf("BMI= %.1f,%s%n",bmi,bmi>People.overWeight?"過重":"正常");


		double bmi2 = People.BMI(80, 1.7);
		System.out.println("static BMI= " +bmi2);
	

		System.out.println( String.join("@", "1","2","3"));
			
		
	}

}
