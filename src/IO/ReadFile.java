package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		
		// 自動close
		try (FileInputStream fis = new FileInputStream("C:\\java\\io_1.txt");
			 BufferedInputStream bis = new BufferedInputStream(fis);){
			
			System.out.println("available = "+fis.available());//取得檔案大小(多少bytes)
			
			int b = bis.read(); //一次讀一個byte
			System.out.println("byte= "+b);
			char c = (char)b;
			System.out.println(c); //ASCII table 
		
			System.out.println("available = "+fis.available());//會記錄讀到哪裡,讀一次少一次
			b = bis.read(); //如果回傳-1表示到底讀完了
			System.out.println("byte= "+b);
			c = (char)b;
			System.out.println(c); //ASCII table 

		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
