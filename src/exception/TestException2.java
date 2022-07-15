package exception;

import java.io.File;
import java.io.FileNotFoundException;

public class TestException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			checkfile("c://java//aaa.txt");
			System.out.println("看看這行有沒有執行");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}
    //當建構方法宣告了throws checked exception, 則在main方法中呼叫時必須處理exception
	// 如果宣告的是其他runtime exception, 則不會強迫處理
	public static void checkfile(String filePath) throws FileNotFoundException{
		
		File file = new File(filePath);
		  //如果不存在 (!存在)=不存在
		if (!file.exists()) {
			
			//產生exception物件 // 用throw跑出exception
			/*
			FileNotFoundException fne = new FileNotFoundException(filePath+"找不到檔案");
			throw fne;
			*/
			throw new FileNotFoundException(filePath+"找不到檔案");
		}
		
	}
	
}
