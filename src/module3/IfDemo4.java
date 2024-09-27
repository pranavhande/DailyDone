package module3;

import java.util.Scanner;

public class IfDemo4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		if(num>=0 && num<10) {
			System.out.println("1st digit number");
		}
		else if(num>=10 && num<100) {
			System.out.println("2nd digit number");
		}
		
		else if(num>=100 && num<1000) {
			System.out.println("3rd digit number");
		}
		
		else if(num>=1000 && num<10000) {
			System.out.println("4th digit number");
		}
		
		else {
			System.out.println("Invalid");
		}
		
		
	}

}
