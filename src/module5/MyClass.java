package module5;

class MyClass2 {
	public void fun2() {
		System.out.println("Fun2");
	}
}

class MyClass1 {

	public void fun1() {
		System.out.println("Fun1");
	}
}

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass1 class1 = new MyClass1();
		class1.fun1();

		MyClass2 class2 = new MyClass2();
		class2.fun2();
	}

}
