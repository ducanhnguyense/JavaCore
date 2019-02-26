package ducanh.demo;

public class ThreadExample1 {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				try {
					System.out.println("Pause");
					Thread.sleep(3000);
					System.out.println("Restart");
				} catch (InterruptedException e) {

				}
			}
		};
		thread.start();
		MyThread mythread = new MyThread();
		// thread.run();

	}

}

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("Pause");
				Thread.sleep(500);
				System.out.println("Restart");
			} catch (InterruptedException e) {

			}
		}
	}
}

class YourThread implements Runnable {
	public void run() {

	}
}