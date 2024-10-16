package section19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EX19_04 {
	public static void main(String[] args) {
		OutputStream out = null;
		try {
			out = new FileOutputStream("write_arrty.txt", false);
			String str = "hello world";
			byte[] strArray = str.getBytes();
			out.write(strArray);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
