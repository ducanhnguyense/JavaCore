package ducanh.demo;

public class Test {

	public static void main(String[] args) {
		int a = 10, b = 20, max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("Max:" + max);
		// dung bieu thuc tam phan
		max = (a > b) ? a : b;
		System.out.println("Max: " + max);
	}
}
