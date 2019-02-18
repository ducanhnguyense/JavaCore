package ducanh.demo;

public class OverloadExample2 extends Tutorial{
	//Su dung overload khi cung mot thao tac giong nhau nen ta co the dat ten giong nhau nhu connect database : MySQL, databaseSQL...
	public static void main(String[] args) {
		OverloadExample2 overload = new OverloadExample2();
		System.out.println(overload.add(3, 5));
		System.out.println(overload.add(3.5f, 5.4f));
		System.out.println(overload.add("Ben ", "Ten"));
	}
	
	public int add(int a, int b) {
		return a + b;
	}

	float add(float a, float b) {
		return a + b;
	}
}

class Tutorial{
	public String add(String str1,String str2 ) {
		return str1+str2;
	}
}
