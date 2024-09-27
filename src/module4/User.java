package module4;

import java.util.Scanner;

public class User {
	
	private String name;
	private int age;
	private double sal;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter name,age,salary");
		name = sc.next();
		age = sc.nextInt();
		sal = sc.nextDouble();
	}
	
	public void checkAge() {
		if(age>18 && age<100) {
			System.out.println("valid age");
		}
		else {
			System.out.println("Invalid age");
		}
	}
	
	public void checkSal() {
		if(sal>=10000 && sal<100000) {
			System.out.println("valid salary");
		}
		else {
			System.out.println("Invalid Salary");
		}
	}
	
	public void display() {
		System.out.println("Name"+name);
		System.out.println("Age"+age);
		System.out.println("Salary" + sal);
	}

}
