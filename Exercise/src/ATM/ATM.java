package ATM;


import java.util.Scanner;

public class ATM {
	//450.000 % 10000 = 0

	public static void main(String[] args) {
		int money = 0;
		final int FIVE_HUNDRED_THOUSAND = 500000;
		final int TWO_HUNDRED_THOUSAND = 200000;
		final int ONE_HUNDRED_THOUSAND = 100000;
		final int FIFTY_THOUSAND = 50000;
		final int TWEENTY_THOUSAND = 20000;
		final int TEN_THOUSAND = 10000;
		
		int fiveHundredThousand = 0;
		int twoHundredThousand = 0;
		int oneHundredThousand = 0;
		int fiftyThousand = 0;
		int tweentyThousand = 0;
		int tenThousand = 0;
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Your's money: ");
			money = scanner.nextInt();
		}while(money%10000 != 0);
		
		scanner.close();
		
		System.out.println("-------------------------");
		
		//500.000
		if(money >= FIVE_HUNDRED_THOUSAND) {
			fiveHundredThousand = money / FIVE_HUNDRED_THOUSAND;
			money = money % FIVE_HUNDRED_THOUSAND;
			System.out.printf("Menh gia %d: %d\n", FIVE_HUNDRED_THOUSAND,fiveHundredThousand);
		}
				
		//200.000
		if(money >= TWO_HUNDRED_THOUSAND) {
			twoHundredThousand = money / TWO_HUNDRED_THOUSAND;
			money = money % TWO_HUNDRED_THOUSAND;
			System.out.printf("Menh gia %d: %d\n",TWO_HUNDRED_THOUSAND,twoHundredThousand);
		}
		
		//100.000
		if(money >= ONE_HUNDRED_THOUSAND) {
			oneHundredThousand = money / ONE_HUNDRED_THOUSAND;
			money = money % ONE_HUNDRED_THOUSAND;
			System.out.printf("Menh gia %d: %d\n",ONE_HUNDRED_THOUSAND,oneHundredThousand);
		}
		
		//50.000
		if(money >= FIFTY_THOUSAND) {
			fiftyThousand = money / FIFTY_THOUSAND;
			money = money % FIFTY_THOUSAND;
			System.out.printf("Menh gia %d: %d\n",FIFTY_THOUSAND,fiftyThousand);
		}
		
		//20.000
		if(money >= TWEENTY_THOUSAND) {
			tweentyThousand = money / TWEENTY_THOUSAND;
			money = money % TWEENTY_THOUSAND;
			System.out.printf("Menh gia %d: %d\n",TWEENTY_THOUSAND,tweentyThousand);
		}
		
		//10.000
		if(money >= TEN_THOUSAND) {
			tenThousand = money / TEN_THOUSAND;
			money = money % TEN_THOUSAND;
			System.out.printf("Menh gia %d: %d\n",TEN_THOUSAND,tenThousand);
		}
	}

}
