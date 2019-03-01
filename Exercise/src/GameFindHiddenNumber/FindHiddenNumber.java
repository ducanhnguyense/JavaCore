package GameFindHiddenNumber;

import java.util.Scanner;

public class FindHiddenNumber {

	public static void main(String[] args) {
		//40
		
		//Your's Number (1-100):
		//50
		//Greater than!					x<50
		//Your's Number (1-100):
		//30
		//Less than!					30 < x < 50
		//Your's Number (1-100):
		//35
		//Less than!					35 < x < 50
		//Your's Number (1-100):
		//40
		//Successfull
		
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 1;
		int range = (MAX_NUMBER - MIN_NUMBER) + 1;
		int secretNumber = (int)(Math.random() *range) +MIN_NUMBER;
		
		Scanner scanner = new Scanner(System.in);
		
		int yourNumber = 0;
		while(secretNumber != yourNumber) {
			System.out.println("Your's Number (1-100): ");
			yourNumber = scanner.nextInt();
			scanner.nextLine();
			
			if(yourNumber > secretNumber) {
				System.out.println("Greater than!");
			}else if(yourNumber < secretNumber) {
				System.out.println("Less than!");
			}else {
				System.out.println("Successfull");
			}			
		}
		scanner.close();	
	}
}
