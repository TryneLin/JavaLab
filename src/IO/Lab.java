package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Lab {
	
	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("https://graph.facebook.com/AppStore/picture?type=large");
		
		try (InputStream is = url.openStream();
				BufferedInputStream bis = new BufferedInputStream(is);
				FileOutputStream fos = new FileOutputStream("C:\\java\\io_3.jpg");//檔案格式與來源一致
				BufferedOutputStream bos = new BufferedOutputStream(fos);	
				) {
			
			System.out.println(is.available());
			
			byte[] buffer = new byte[1024];//buffer大小可以自訂, 視情況
			int length;
			while ((length=bis.read(buffer)) != -1) {
				bos.write(buffer, 0, length);
			}
			System.out.println(is.available());
			System.out.println("done");

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
	}

}
