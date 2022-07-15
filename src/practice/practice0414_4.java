package practice;

public class practice0414_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 題目：利用條件運算子的巢狀來完成此題：學習成績>=90分的同學用A表示，60-89分之間的用B表示，60分以下的用C表示。
		
		int score =55 ;
		if (score>= 90) {
			System.out.println("學習成績: "+score +"分 = A");
		} else if (90 > score && score >= 60) {
			System.out.println("學習成績: "+score +"分 = B");
		} else {
			System.out.println("學習成績: "+score +"分 = C");
		}

		
		int score2 = 60;
		String grade = score2>=90 ? "A" : ( score2>=60 ? "B" : "C");
			System.out.println("學習成績: "+score2 +"分 = " +grade);
	
	}

}
