package Patterns;

public class Pattern13 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 6; k++) {
                System.out.print("*"+ " ");
            }

            System.out.println();
        }
		for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 6; k++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
	}
	
}
