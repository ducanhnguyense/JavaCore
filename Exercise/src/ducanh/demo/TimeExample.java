package ducanh.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExample {

	public static void main(String[] args) {
		// Get time by milis
		long start = System.currentTimeMillis();

		try {
			for (int i = 0; i < 1000; i++) {
				Thread.sleep(2);
			}
		} catch (Exception e) {

		}

		long end = System.currentTimeMillis();

		System.out.println("Milis: " + (end - start));

		// Get time by nano, chinh xac hon milis

		start = System.nanoTime();
		end = System.nanoTime();
		System.out.println("Nano: " + (end - start));

		// Display system time
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String day = dateFormat.format(date);
		System.out.println(day);
	}

}
