package ICICIBank;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ch;
		String choice;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("=================ICICI Bank====================");
			System.out.println("1. Accepting Details");
			System.out.println("2.Display Details");
			System.out.println("3. Withdraw Amount");
			System.out.println("4. Deposit Amount");
			System.out.println("5. Transfer Amount");
			System.out.println("6. Check Balance");
			System.out.println("7. Update Balance");
			System.out.println("8. Exit");
			
			System.out.println("Enter choice");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1 :
				System.out.println("Accepting Details");
				break;
			case 2 :
				System.out.println("Displaying Details");
				break;
			case 3 :
				System.out.println("Withdraw Amount");
				break;
			case 4 :
				System.out.println("Depositing Amount");
				break;
			case 5 :
				System.out.println("Transfer Amount");
				break;
			case 6 :
				System.out.println("Check Balance");
				break;
			case 7 :
				System.out.println("Update Balance");
				break;
				
				
			case 8 :
				System.out.println("Thank you for visiting!!!!!!!");
				System.exit(0);
				break;
			
			}
			
			System.out.println("Do you want to continue?(y/n)");
			choice= sc.next();
			
		}while(choice.equalsIgnoreCase("Y"));
		
		System.out.println("Thank you for visiting!!!!!!!");

	}

}
