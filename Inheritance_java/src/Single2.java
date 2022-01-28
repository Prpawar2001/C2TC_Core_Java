class Parent {
	void father() {
		System.out.println("John dou");
	}
}
public class Single2 extends Parent {
	void child() {
		System.out.print("Sam");
	}

	public static void main(String[] args) {
		Single2 s = new Single2();
		s.child();
		System.out.print(" is father of ");
		s.father();
	}

}