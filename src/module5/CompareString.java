package module5;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=200;
		
		if(a==b)
			System.out.println("Same");
		
		String str1="pranav";
		String str2="pranav";
		
		if(str1==str2) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
		
		
		String str3 = new String("pranav");
		String str4 = new String("PRANAV");
		
		if(str3.equals(str4)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
		
		if(str3.equalsIgnoreCase(str4)) {
			System.out.println("same...");
		}
		else {
			System.out.println("Not Same,,,,,,,,,,,,,");
		}

	}

}
