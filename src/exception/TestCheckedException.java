package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.zip.ZipException;

public class TestCheckedException {

	// 方法2: 在方法上宣告 throws 處理
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("c:\\java\\aaa.txt");

		
	/* 方法1: 在方法中用try catch處理exception
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 路徑可以用\\或是/, 不能用\因為已經被跳脫字元用掉了
		// ctrl +1 :quick fix
		try {
			FileReader fr = new FileReader("c:\\java\\aaa.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/
		
	}

}
