package module2;

import java.util.Scanner;

public class Construction {
	
	private String GSTNO;
	private String name;
	private double No_Of_Floors;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter GSTNO");
		GSTNO = sc.next();
		System.out.println("Enter Name");
		name = sc.next();
		System.out.println("Enter No_Of_Floors");
		No_Of_Floors = sc.nextDouble();
	}
	
	public void material() {
		System.out.println("Maiterial Required");
	}
	
	public void labourPayments() {
		System.out.println("Labour Payments ");
	}

	
	public void constructionCost() {
		System.out.println("Construction Cost Required");
	}
	
	public void display() {
		System.out.println("GSTNO : "+GSTNO);
		System.out.println("Name : "+name);

		System.out.println("No of floors : "+No_Of_Floors);

	}

}
