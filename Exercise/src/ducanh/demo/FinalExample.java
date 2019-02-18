package ducanh.demo;

public class FinalExample {
	final float PI = 3.14f;
	int number;

	public static void main(String[] args) {
		FinalExample test = new FinalExample();
		test.number = 15;
		// Error : hang so k thay doi duoc gia tri
		// test.PI= 3.15f;
	}

	public void change() {
		number = 30;
		// PI=3.15f;
	}
	//// Error : Khong override phuong thuc co tu khoa final
	/*
	 * void show() {
	 * 
	 * }
	 */
}
final class Final {
	final void show() {

	}
}
