class A1{
	int a = 10;
	int b = 12;
	void add() {
		System.out.println("Addition is " + (a + b));
	}
}

class B1 extends A1{
	void subtract() {
		System.out.println("Subtraction is " + (a - b));
	}
}

class C1 extends B1{
	void multiply() {
		System.out.println("Multiplication is " + (a * b));
	}
}

public class Multilevel3 {

	public static void main(String[] args) {
		C1 obj = new C1();
		obj.add();
		obj.subtract();
		obj.multiply();
	}
}
