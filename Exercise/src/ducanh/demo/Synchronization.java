package ducanh.demo;

//dong bo hoa
public class Synchronization {

	public static void main(String[] args) {

		ThreadExam threadEx = new ThreadExam();
		Thread thread1 = new Thread(threadEx);
		Thread thread2 = new Thread(threadEx);

		thread1.setName("Michael");
		thread2.setName("Kim");

		thread1.start();
		thread2.start();
	}

}

class ThreadExam implements Runnable {
	private int money = 1000;

	// them synchronized vao thi cac thread chiem quyen se hoat dong het roi moi den thread ke tiep
	// trong qua trinh lam thuc te thi phai can bang giua hieu nang va dong bo
	public synchronized void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		} catch (Exception e) {

		}
	}
}
