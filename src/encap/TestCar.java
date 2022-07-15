package encap;

import javax.xml.transform.Source;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car("銀色");
		
		//一般class設定
		//car.model= "Prius";
		//c.setModel("Prius");
        //c.price= 100000;
		System.out.printf("車子型號: %s,價錢: %s,顏色: %s%n",c.getModel(),c.getPrice(),c.getColor());
		
	}

}
