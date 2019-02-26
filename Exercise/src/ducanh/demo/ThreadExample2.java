package ducanh.demo;

public class ThreadExample2 {

	public static void main(String[] args) {
		//Khi co nhieu thread cung thuc hien, thi khong dam bao duoc tuan tu
		ThreadEx threadEx = new ThreadEx();
		Thread thread1 = new Thread(threadEx);
		Thread thread2 = new Thread(threadEx);

		thread1.setName("Michael");
		thread2.setName("Kim");

		thread1.start();
		thread2.start();
	}

}

class ThreadEx implements Runnable {
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		} catch (Exception e) {

		}
	}
}
