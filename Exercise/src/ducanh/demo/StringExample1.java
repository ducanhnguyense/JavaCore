package ducanh.demo;

public class StringExample1 {

	public static void main(String[] args) {
		String study = "Study and Share";
		System.out.println(study);
		// lay ki tu tai vi tri n
		System.out.println(study.charAt(6));
		// Index of tra ve vi tri phan tu dau tien
		System.out.println(study.indexOf("Share"));
		// cat chuoi
		System.out.println(study.substring(5));
		// cat tu vi tri thu may va thu may
		System.out.println(study.substring(5, 8));

		String name = " Life's beautiful ";
		// cat nhung khoang trong o dau va cuoi
		System.out.println(name.trim());
		// Chuyen thanh ki tu hoa sang thuong
		System.out.println(name.toLowerCase());
		// Chuyen thanh ki tu thuong sang hoa
		System.out.println(name.toUpperCase());
		String[] arr = name.trim().split(" ");
		for (int i = 1; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String myName = "Duc Anh";
		String firstName = myName.substring(0,3);
		String lastName = myName.substring(4);
		int length = myName.length();//lay do dai chuoi
		System.out.println("Length of myName: "+ length);
		System.out.println("Substring first name: "+ firstName);
		System.out.println("Substring last name: "+ lastName);
		
		String firstString = "Hello";
		String secondString = "Michael";
		String result = firstString + secondString;
		System.out.println(result);
	}

}
