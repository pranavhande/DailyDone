package module3;

import java.util.Scanner;

public class IfDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		

		if(num>num2) {
			System.out.println("Num 1 is greater");
		}
		else if(num<num2)
		{
			System.out.println("Num 1 is Smaller");

		}
		
		else {
			
			System.out.println("Number is Same");

		}
		

	}

}
