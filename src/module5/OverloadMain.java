package module5;

public class OverloadMain {
	
	public static void main() {
		System.out.println("Main method without parameters");
	}

	public static void main(int a, int b) {
		System.out.println("Main method with 2 parameters");
	}
	
	public static void main(int a) {
		System.out.println("Main method with 1 parameters");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		OverloadMain main = new OverloadMain();
//		main.main();
//		main.main(10);
//		main.main(10, 20);
		
		main();
		main(10,20);
		main(10);

	}

}
