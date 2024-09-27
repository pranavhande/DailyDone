package module1;

public class Construction {
	
	private String GSTNO;
	private String name;
	private double No_Of_Floors;
	
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



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Construction construction = new Construction();
		construction.GSTNO = "SAP4654496545";
		construction.name = "PRAGATI CONSTRUCTION";
		construction.No_Of_Floors = 12;
		
		construction.display();
		
		construction.constructionCost();
		construction.labourPayments();
		construction.material();
		
	}


}
