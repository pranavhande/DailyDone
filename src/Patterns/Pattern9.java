package Patterns;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		for(int i= 1;i<=5;i++) {
			for(int j=1,k=i;j<=i;j++) {
			System.out.print(k++);
			}
			System.out.println();
		}

	}

}
