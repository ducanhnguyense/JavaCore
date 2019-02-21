package ducanh.demo;

import java.io.File;
import java.io.IOException;

public class File_Directory_Example {

	public static void main(String[] args) {
		
		try {
			//tao file
			File file = new File("test.txt");
			file.createNewFile();
			//tao thu muc
			File directory = new File("new");
			directory.mkdir();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
