package module2;

public class TestConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Construction construction = new Construction();
		construction.accept();
		construction.display();
		construction.material();
		construction.constructionCost();
		construction.labourPayments();
		
		System.out.println("===============================");

		Construction construction2 = new Construction();
		construction2.accept();
		construction2.display();
		construction2.material();
		construction2.constructionCost();
		construction2.labourPayments();
		
		
		
		
		
		 
	}

}
