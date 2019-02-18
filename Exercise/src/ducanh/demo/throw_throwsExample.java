package ducanh.demo;

public class throw_throwsExample {

	public static void main(String[] args) {
		Building b = new Building();
		try {
			b.go();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class MyException extends Exception {
	// Do something in here
}

class Building {
	// throws dung de su dung khai bao trong phuong thuc
	// throw dua ra ngoai le trong than ham
	// dung throws khi khong thich dung nhieu dong try - catch
	// throws va try catch dung de handle Exception
	public void show() throws MyException {
		int numberConnection = 0;
		if (numberConnection > 100) {
			throw new MyException();
		}
	}

	public void go() throws InterruptedException {
		Thread.sleep(1000);
	}
}