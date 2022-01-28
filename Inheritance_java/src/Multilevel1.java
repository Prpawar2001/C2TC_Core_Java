class Parent1{
	void a() {
		System.out.println("This is Parent1");
	}
}

class Circle extends Parent1{
	void b() {
		System.out.println("This is Circle");
	}
}

class Square extends Circle{
	void c() {
		System.out.println("This is Square");
	}
}
public class Multilevel1 {

	public static void main(String[] args) {
		Square s = new Square();
		s.a();
		s.b();
		s.c();
	}
}
