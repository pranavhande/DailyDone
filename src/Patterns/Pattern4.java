package Patterns;

public class Pattern4 {

	public static void main(String[] args) {
		
		char ch='A';
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print((char)(ch+i+j));
			}
			System.out.println();
		}
	}
}
