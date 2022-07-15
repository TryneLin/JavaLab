package IO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir = new File("C:\\Shared\\BDSE_Java\\myJavaWorkspace\\JavaLab\\src");
		File[] files = dir.listFiles();
		
		for (File file : files) {
			System.out.println(file.getName()+(file.isDirectory()?" 是目錄":" 不是目錄"));
			long lastModified = file.lastModified(); //java.util.Date
			Date date = new Date(lastModified);
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd a hh:mm:ss");
			System.out.println(df.format(date));
		}
		
		
		
	}

}
