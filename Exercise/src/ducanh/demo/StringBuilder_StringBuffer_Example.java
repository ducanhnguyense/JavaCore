package ducanh.demo;

public class StringBuilder_StringBuffer_Example {
	// toc do xu ly cua StringBuilder se nhanh hon StringBuffer
	public static void main(String[] args) {
		TestPerformance();
		StringBuilder builder = new StringBuilder("Change is good");
		StringBuffer buffer = new StringBuffer("Michael");
		
		builder.append("2019");
		System.out.println(builder);
		builder.deleteCharAt(10);
		System.out.println(builder);
		builder.delete(10,13);
		System.out.println(builder);
		builder.insert(6, "2019");
		System.out.println(builder);
		buffer.reverse();
		System.out.println(buffer);
	}
	public static void TestPerformance() {
		long startTime = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer("Hello");
		for (int i = 0; i < 100000; i++) {
			buffer.append("Word");
		}
		System.out.println("StringBuffer is: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		StringBuilder buider = new StringBuilder("Hello");
		for (int i = 0; i < 100000; i++) {
			buider.append("Word");
		}
		System.out.println("StringBuilder is: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}
