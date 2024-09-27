package module4;

import java.util.Scanner;

public class Emp {
	
	private int empNo;
	private String ename;
	
	private double bal;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter empNo,ename,balance");
		empNo = sc.nextInt();
		ename = sc.next();
		bal = sc.nextDouble();
	}
	
	public void checkEmpNo() {
		if(empNo>0) {
			System.out.println("valid employee");
		}
		else {
			System.out.println("Invalid employee");
		}
	}
	
	public void checkBal() {
		if(bal>=0 && bal<100000) {
			System.out.println("valid Balance");
		}
		else {
			System.out.println("Invalid Balance");
		}
	}
	
	public void display() {
		System.out.println("EmpNo : "+empNo);
		System.out.println("Name : "+ename);
		System.out.println("Balance : " + bal);
	}

}
