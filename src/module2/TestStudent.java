package module2;

public class TestStudent{
	
	public static void main(String[] args) {
		
		Student student = new Student();
//		student.accept();
		student.display();
		student.appearExam();
		student.attendClass();
		student.completeAssignment();
		
		System.out.println("=====================================");
		
		Student student2 = new Student();
		student2.accept();
		student2.display();
		student2.appearExam();
		student2.attendClass();
		student2.completeAssignment();
	}

}
