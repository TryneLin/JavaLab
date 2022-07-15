package IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileOutputStream fos = new FileOutputStream("C:\\java\\io_2.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			
			String content = "中文abc123456";
			byte[] bytes = content.getBytes();//型態轉換 String->byte[]
			bos.write(bytes);
			System.out.println("done");
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
