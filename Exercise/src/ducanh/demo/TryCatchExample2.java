package ducanh.demo;

import java.io.File;
import java.io.IOException;

public class TryCatchExample2 {

	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
			File file = new File("test.txt");
			file.createNewFile();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {

		} catch (Exception e) {
				//Write log
				//Show dialog
				//Print cmd
		}
		// Khi dat catch thi khong dat thu tu con sau cha
	}

}
