package practice;

public class practice0414_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//題目：輸入一行字元，分別統計出其英文大寫字母、小寫字母、空格、數字和其它字元的個數。
		
		String arg = "ABC df 123  #$%" ;  // 需要知道ASCII碼
		char[] argchar = arg.toCharArray();
		
		int numOfSpace = 0;  // 32
		int numOfNum = 0;    // 48-57
		int numOfLETTER = 0; // 65-90
		int numOfLetter = 0; // 97-122
		int numOfOthers = 0;
		
		for (int i = 0; i < argchar.length; i++) {
			if (argchar[i] == 32) {
				numOfSpace ++;
			} else if (48 <= argchar[i] && argchar[i] <= 57) {
				numOfNum ++;
			} else if (65 <= argchar[i] && argchar[i] <= 90) {
				numOfLETTER ++;
			} else if (97 <= argchar[i] && argchar[i] <= 122) {
				numOfLetter ++;
			} else{
				numOfOthers ++;
			}
			
		}
		System.out.println("字串 ["+arg+"] 中包含: "
							+numOfLETTER+"個大寫字母/ "
							+numOfLetter+"個小寫字母/ "
							+numOfSpace+"個空格/ "
							+numOfNum+"個數字/ "
							+numOfOthers+"個其他符號");
	}

}
