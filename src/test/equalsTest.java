package test;

public class equalsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "001";
		String b = "001";
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		String a1 = new String("001");
		String b1 = new String("001");
		System.out.println(a1 == b1);
		System.out.println(a1.equals(b1));
		
		String a2 = "001";
		String b2 = new String("001");
		System.out.println(a2 == b2);
		System.out.println(a2.equals(b2));

	}

}
