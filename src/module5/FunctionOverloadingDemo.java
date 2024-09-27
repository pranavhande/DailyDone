package module5;

public class FunctionOverloadingDemo {
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static int add(int a,int b, int c) {
		return a+b+c;
	}
	
	public static double add(int a,double b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = add(10, 20);
		System.out.println(result);
		int result1 = add(10, 20, 30);
		System.out.println(result1);
		double result2 = add(10, 20.56);
		System.out.println(result2);
		
	}

}
