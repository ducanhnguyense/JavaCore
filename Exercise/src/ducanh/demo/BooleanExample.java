package ducanh.demo;

public class BooleanExample {

	public static void main(String[] args) {
		int a = 0, b = 3;
		/*
		 * if ((a < 10) && (b > 5)) { System.out.println("True"); } else {
		 * System.out.println("False"); }
		 * 
		 * if ((a < 10) || (b > 5)) { System.out.println("True"); } else {
		 * System.out.println("False"); }
		 */
		// Khac nhau giua && va &, || va |
		// && thuc hien kiem tra dieu kien dau tien neu sai se dung lai, con & thuc hien
		// day du khong quan tam dieu kien dung sai
		/*
		 * if ((a++ > 10) && (b-- < 5)) { System.out.println("a: " + a + "b:" + b); }
		 * else { System.out.println("a: " + a + "b:" + b); }
		 */
		// || neu dung dieu kien dau tien thi dung lai khong thuc hien dieu kien thu 2,
		// con | thi van thuc hien dieu kien tiep theo
		if ((a++ > 10) || (b-- < 5)) {
			System.out.println("a: " + a + "b:" + b);
		} else {
			System.out.println("a: " + a + "b:" + b);
		}
	}

}
