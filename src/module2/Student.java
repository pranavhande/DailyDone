package module2;

import java.util.Scanner;

public class Student {
	private int rollNo;
	private String name;
	private double score;
	
	Scanner sc = new Scanner(System.in);
	 
	public void accept() {
		System.out.println("Enter rollNo");
		rollNo=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter Score");
		score=sc.nextDouble();
	}
	
	public void attendClass() {
		System.out.println("Attending the class");
	}
	
	public void appearExam() {
		System.out.println("apperaring for Exam");
	}

	
	public void completeAssignment() {
		System.out.println("complete Assignments");
	}

	public void display() {
		System.out.println("rollNo :"+rollNo);
		System.out.println("Name :"+name);

		System.out.println("Score :"+score);
	}
	
	
}
