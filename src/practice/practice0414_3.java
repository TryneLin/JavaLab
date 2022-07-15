package practice;

public class practice0414_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//題目：將一個正整數分解質因數。例如：輸入90,打印出90=2*3*3*5。
	
		int input = 504;
		System.out.print(input + "=" );
		for (int i = 2; i <= input ;) { 
			//這裡拿掉了i++, 改用reset i = 2 和else i +=1, 避免小的質因數沒有再跑一次
			 
			if (i != input &&  input%i == 0) {
				 System.out.print( i + "*");
				 input = input/i;
				 i = 2; //這行特別重要, 讓i重新從2開始
			}else {i +=1;
			} 
	
		}
		System.out.print(input + "。");

	}

}
