//class B{
//	B(){
//		this(5);
//		System.out.println("A class no parameter method");
//	}
//	B(int x){
//		this("king");
//		System.out.println("A class integer method");
//	}
//	B(String x)
//	{
//		System.out.println("A class string method");
//	}
//}
public class Constructor_chaining {

	public static void main(String[] args) {
		new B(5);
	}

}

class A1{
	A1(int x){
		System.out.println("Class A(int x)");
	}
	A1(){
//		this(5);
		System.out.println("Class A()");
	}
	
}

class B extends A1{
	B(){
		System.out.println("Class B()");
	}
	B(int x){
		super(x);
		System.out.println("Class B(int x with super)");
	}
}