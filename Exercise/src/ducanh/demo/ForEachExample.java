package ducanh.demo;

public class ForEachExample {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };
		String[] names = { "Nguyen", "Duc", "Anh" };

		for (int x : numbers) {
			System.out.println(x);
		}

		System.out.println();

		for (String name : names) {
			System.out.println(name);
		}
	}

}
