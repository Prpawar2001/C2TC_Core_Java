class A{
	String name;
	int age;
	
	A(String n, int a){
		name=n;
		age=a;
	}
	A(A c) {
		name=c.name;
		age=c.age;
	}
}
public class Copy_constructor {

	public static void main(String[] args) {
		A a1=new A("king",18);
		A a2=new A(a1);
		System.out.print(a2.name + " ");
		System.out.println(a2.age);
		System.out.print(a1.name + " ");
		System.out.println(a1.age);
	}
}