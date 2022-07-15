package array;

public class HomewrkArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] x = {1.1,2.0,1.2,1.4,0.5,6.0};
		double M = 0;
		for (int i = 0; i < x.length; i++) {
			if (M<x[i]) {
				M=x[i];
			}
		}
		System.out.println("最大值= " +M);
		
		double m = 10;
		for (int i = 0; i < x.length; i++) {
			if (m>x[i]) {
				m=x[i];
			}
		}
		System.out.println("最小值= " +m);
		
		double a = 0;
		for (int i = 0; i < x.length; i++) {
			a = a + x[i];
		}
		System.out.println("平均值= " + (a/x.length));
		
		//「平方和的平均」減去「平均的平方」再開根號
		double sd = 0;
		for (int i = 0; i < x.length; i++) {
			a = a + x[i];
		}
		
		// 聖誕樹
		
		int j = 7; //層數
		int s = 2*j+1; //最多的那層有幾顆
		for (int i = 0; i <= j; i++) {
			
			for (int i3 = 0; i3 < (s-(2*i-1))/2; i3++) {
				System.out.print(" ");//空白印出幾次 				
			}
			
			for (int i2 = 0; i2 < 2*i+1 ; i2++) {
				System.out.print("*");//星星印出幾次 
			}
			System.out.println(); //換行
		}

		
		
	}

}
