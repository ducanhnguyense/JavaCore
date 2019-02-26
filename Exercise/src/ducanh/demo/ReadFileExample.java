package ducanh.demo;

import java.io.*;

public class ReadFileExample {
	public static void main(String args[]) throws IOException {

		File file = new File("test.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line = "";
			int i = 0;
			while ((line = br.readLine()) != null) {
				System.out.println(++i + ": " + line);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException ex) {

		} catch (IOException e) {

		}

	}
}
