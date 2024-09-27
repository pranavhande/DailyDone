import java.util.Scanner;

public class IfDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int rem = num/10;
		int qutioent = num %10;
		
		
		System.out.println("ans : " + Math.pow(rem, qutioent));
		

	}

}
