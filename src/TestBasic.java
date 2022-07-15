//link with editor 常開
public class TestBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long salary;
		// 劃出一個8 bytes的區塊, 名字叫做salary
		salary = 2000;
		salary = 3000;
		System.out.println("薪水 = " + salary);
		// 後面值會覆蓋前面值

		// ## 資料型態
		// int salary;
		// 無論型態, 相同變數不可重複使用

		int salaryOfMary = 3500;
		System.out.println("Mary的薪水 = " + salaryOfMary);
		// Camel case 小寫開頭, 後面接續字大寫開頭

		long a = 12346789000L;
		// 前面輸入了整數2000, 預設為int型態,判斷最多只能輸入21億, 需輸入L宣告為long型態

		long b = 2100000000L + 2100000000;
		System.out.println(b);
		// overflow 資料溢位 不會顯示為錯誤! 最危險, 在python當中也是

		char c = '中';
		System.out.println(c);
		// 只能單一一個字, 稱為字元, 單引號

		boolean paid = true;
		System.out.println(paid);

		System.out.println("\"Hello\rWorld\"\n\"There is a tab\"\tc:\\java");
		// 跳脫字元: 換行符號可用 \n 或 \r都可以 [windows都可以, linux跟mac只能用\n]

		double o = 10.2;
		int p = (int)o;
		System.out.println(p);
		//型態轉換 Casting 強制轉換
		
		// ## 運算
	    double x = 10 ;
	    int y = 3 ;
	    double z = x + y;
	    // 型態晉升Promotion,當運算型態不同,以能儲存range大的為結果型態(double>float>long>int),避免資料溢位
	    System.out.println("z="+(x+y));
	    System.out.println(x-y);
	    System.out.println(x*y);
	    System.out.println(x/y);
	    System.out.println(x%y);
	    
	    // 0408
	    int age = 32;
	    boolean isAdult = (age >= 18);
	    System.out.println(isAdult);
	    // == != 
	    boolean isTeenage = (age < 18 && age >= 10);
	    System.out.println(isTeenage);
	    // &&也可以用&, 差在單邊計算跟雙邊計算, 速度差異, 同理||也可以用|
	    System.out.println(12&6);
	    System.out.println(12|6);
	    
	    System.out.println("age= "+ age);
	    age++;
	    System.out.println("age= "+ age);
	    System.out.println("age= "+ ++age); //先計算後取值
	    System.out.println("age= "+ age++); //先取值後計算, 實際上已經是35但印出先取值的結果34
	    System.out.println("age= "+ age);
	    // age++ ; age= age+1; age +=1

	    System.out.println(age+x);
	    System.out.println(age+y);
	    age += x;  //自動強制轉換 age = (int)age + x
	    // age = age + x; 會錯誤因為型態不同
	    
	    System.out.println(age>=18 ? "成年" : "未成年");
	    // 簡易if else 條件 ? 成立時傳回結果 : 不成立時傳回結果
	    System.out.println(age>=18 ? (age>30? "壯年" : "成年") : "未成年");
	    // 也能寫成巢狀 if else
	    
	}

}
