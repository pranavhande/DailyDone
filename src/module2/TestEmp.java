package module2;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp emp = new Emp();
		emp.accept();
		emp.display();
		emp.completeProject();
		emp.checkAttendance();
		emp.applyLoan();
		
		System.out.println("================================");
		
		Emp emp2 = new Emp();
		emp2.accept();
		emp2.display();
		emp2.completeProject();
		emp2.checkAttendance();
		emp2.applyLoan();
	}

}
