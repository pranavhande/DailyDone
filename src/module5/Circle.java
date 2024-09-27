package module5;

import java.util.Scanner;

public class Circle {

	private int r;
	private double area1, peri;

	final double PI = 3.14;

	public void accept() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		r = sc.nextInt();

	}

	public void checkArea() {
		area1 = PI * r * r;
	}

	public void checkPerimeter() {
		peri = 2 * PI * r;
	}

	public void display() {
		System.out.println("Radius : " + r);
		System.out.println("Area of circle : " + area1);

		System.out.println("Perimeter of circle : " + peri);

	}

}
