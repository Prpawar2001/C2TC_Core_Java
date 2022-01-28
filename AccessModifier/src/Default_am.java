class Default_1{
	
	void print() {
		System.out.println("I am default");
	}
	
}
public class Default_am {
//	if you dont mention any access modifier then it is by default Default.
//	it is only accessible within same project.

	public static void main(String[] args) {
		Default_1 d1=new Default_1();
		d1.print();
	}
	
}