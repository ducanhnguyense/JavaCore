package ducanh.demo;

public class EnumExample2 {
	enum COLOR {
		RED(5), BLUE(6), GREEN(7), YELLOW(8);
		private int value;

		// ham khoi tao
		COLOR(int value) {
			this.value = value;
		}

		// ham get phuong thuc
		public int getValue() {
			return value;
		}
	}

	public static void main(String[] args) {
		COLOR color = COLOR.BLUE;
		System.out.println(color + ": " + color.getValue());
	}

}
