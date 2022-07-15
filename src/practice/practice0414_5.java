package practice;

public class practice0414_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 題目：輸入兩個正整數m和n，求其最大公約數和最小公倍數。
		
		int m = 10;
		int n = 33;
			
		for (int i = Math.min(m,n);  ; i--) {
			if (m%i==0 & n%i==0) {
				System.out.println( "最大公因數("+m+","+n+") = "+i);
				break;
			}
		}
		
		for (int i = Math.max(m, n); ; i++) {
			if (i%m==0 & i%n==0) {
				System.out.println( "最小公倍數["+m+","+n+"] = "+i);
				break;
			}
		}
		
	}

}
