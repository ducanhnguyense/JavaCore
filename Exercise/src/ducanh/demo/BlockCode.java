package ducanh.demo;

public class BlockCode {

	{
		System.out.println("Block 1");
	}
	static {
		System.out.println("Static Block 1");
	}

	public static void main(String[] args) {
		BlockCode blockcode = new BlockCode();
	}

	public BlockCode() {
		System.out.println("Constructor");
	}

	{
		System.out.println("Block 1");
	}
	static {
		System.out.println("Static Block 2");
	}
	// Khoi lenh static se luon duoc thuc hien truoc
	// Khoi lenh se duoc thuc hien truoc constructor
}
