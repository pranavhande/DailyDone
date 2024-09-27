package module3;

import java.util.Scanner;

public class IfDemo3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		

		if((num>num2 ) && (num>num2)) {
			System.out.println("Num 1 is greater");
		}
		
		else if((num2>num) && (num2>num3))
		{
			System.out.println("Num 2 is Greater");

		}
		
		else if((num3>num) && (num3>num2))
		{
			System.out.println("Num 3 is Greater");

		}
		
		else {
			
			System.out.println("Number is Same");

		}
		
	}

}
