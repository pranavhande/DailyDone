package Patterns;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(((i+j)%2)+" ");
			}
			System.out.println();
		}

	}

}
