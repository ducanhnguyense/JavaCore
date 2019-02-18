package ducanh.demo;

public class OverloadExample1 {

	public static void main(String[] args) {
		OverloadExample1 overload = new OverloadExample1();
		System.out.println(overload.add(3, 5));
		System.out.println(overload.add(3.5f, 5.4f));
	}

	// du lieu input dau vao nen toi da la 6
	//overload la 2 phuong thuc trung ten, co the khac nhau ve dau vao, so luong, thu tu
	//co the thay doi gia tri tra ve, cac modifier, tuy vien dua ra ngoai le, khong chat che nhu override
	public int add(int a, int b) {
		return a + b;
	}

	float add(float a, float b) {
		return a + b;
	}
}
