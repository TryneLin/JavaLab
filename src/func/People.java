package func;

public class People {

	//static 型態, 表示類別屬性or靜態屬性, 跟著class走
	//後續main方法要使用時, 直接以class.屬性即可, ex: People.overWeight
	static double overWeight = 24;//固定系統常數
	
	//靜態方法 or 類別方法, 不需要物件, 也不能使用物件屬性, 使用參數
	//靜態方法中不能呼叫物件方法
	public static double BMI(double w, double h) {
		return w/(h*h);
	}
	
	//物件方法
	//物件方法中可以呼叫靜態方法
	double height;
	double weight;
	public double getBMI() {
		//double bmi = weight/(height*height);
		//整合靜態方法
		double bmi = People.BMI(weight, height);
		return bmi;
	
		
	}
}
