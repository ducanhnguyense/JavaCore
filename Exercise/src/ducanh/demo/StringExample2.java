package ducanh.demo;

public class StringExample2 {

	public static void main(String[] args) {
		String myCountry = "Beautiful land1 land2 land 3";
		System.out.println(myCountry.length());

		System.out.println(myCountry.replace("land", "Viet Nam"));

		System.out.println(myCountry.replaceFirst("land", "Viet Nam"));

		System.out.println(myCountry.replaceAll("land", "Viet Nam"));
		
		String name = "Michael";
//		if(name=="Michael") {
//			System.out.println("Michael");
//		}
		if(name.equals("Michael")) {
			System.out.println("Michael");
		}
	}

}
