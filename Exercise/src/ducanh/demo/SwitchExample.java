package ducanh.demo;

public class SwitchExample {

	public static void main(String[] args) {
		int a = 1, b = 2;
		switch (b - a) {
		case 0: {
			System.out.println("0");
			break;
		}
		case 1: {
			System.out.println("1");
			break;
		}
		default: {
			System.out.println("Khong co case tuong ung");
			break;
		}
		}
	}

}
