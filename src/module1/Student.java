package module1;

public class Student {
	
	private int rollNo;
	private String name;
	private double score;
	
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



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.rollNo = 38;
		student.name = "Pranav";
		student.score=84.18;
		
		student.display();
		
		student.attendClass();
		student.appearExam();
		student.completeAssignment();
		
		System.out.println("=====================================================");
		
		Student student2 = new Student();
		student2.rollNo = 31;
		student2.name = "Noor";
		student2.score=80.25;
		
		student2.display();
		
		student2.attendClass();
		student2.appearExam();
		student2.completeAssignment();

	}

}
