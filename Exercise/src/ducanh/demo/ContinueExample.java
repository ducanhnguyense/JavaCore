package ducanh.demo;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			// khi gap continue chuong tinh se bo qua cac dong lenh phia sau continue nhung
			// van tiep tuc chuong trinh
			System.out.println(i);
		}
	}
}
