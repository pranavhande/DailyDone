package Patterns;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int space = 3;
		int star = 1;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print(k+ "*");
			}
			space--;
			star++;
			System.out.println();

		}
	}

}
