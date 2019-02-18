package ducanh.demo;

public class TryCatchExample1 {

	public static void main(String[] args) {
		String test = "StydeAndShare";
		try {
			System.out.println("Before");
			// Error->50
			// System.out.println(test.substring(50));
			System.out.println(test.substring(10));
			int a = 5, b = 1;
			System.out.println("a/b: " + a / b);
		}
		// dua ra nhung thong bao loi ngoai le
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error: " + e.toString());
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.toString());
		}
		catch (Exception e) {
			System.out.println("Error: " + e.toString());
		}
		//finally luon duoc thuc hien
		finally {
			System.out.println("Done");
		}
		System.out.println("After");
	}

}
