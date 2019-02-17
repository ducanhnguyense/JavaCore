package ducanh.demo;

import java.io.*;

public class ReadFile {
	public static void main(String args[]) throws IOException {
		BufferedInputStream bStream = new BufferedInputStream(new FileInputStream("F:\\test.txt"));
		int ch = 0;
		while ((ch = bStream.read()) != -1) {
			System.out.print((char) ch);
		}
		bStream.close();
	}
}
