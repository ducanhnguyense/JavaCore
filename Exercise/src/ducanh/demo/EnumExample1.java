package ducanh.demo;

public class EnumExample1 {
	// enum la ket hop giua mang va object
	enum COLOR {
		RED, BLUE, GREEN, YELLOW;
	}

	public static void main(String[] args) {
		System.out.println(COLOR.BLUE);
		COLOR color = COLOR.RED;
		System.out.println(color);
		System.out.println(color.YELLOW);
		if (color == COLOR.RED) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// ghi chu switch voi enum
		switch (color) {
		case RED:
			System.out.println("Red");
			break;
		case BLUE:
			System.out.println("Blue");
			break;
		case YELLOW:
			System.out.println("Yellow");
			break;
		case GREEN:
			System.out.println("Green");
			break;
		}
	}
}
