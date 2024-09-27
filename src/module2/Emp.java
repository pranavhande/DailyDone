package module2;

import java.util.Scanner;

public class Emp {
	
	private int empNo;
	private String name;
	private double empSalary;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter EmpNo");
		empNo = sc.nextInt();
		System.out.println("Enter Name");
		name = sc.next();
		System.out.println("Enter Salary");
		empSalary = sc.nextDouble();
	}
	
	public void completeProject() {
		System.out.println("Completing Projects");
	}
	
	public void checkAttendance() {
		System.out.println("Checking attendance");
	}
	
	public void applyLoan() {
		System.out.println("Applying loan");
	}
	
	
	public void display() {
		System.out.println("empNo :"+empNo);
		System.out.println("Name :"+name);

		System.out.println("Salary :"+empSalary);
	}
	

}
