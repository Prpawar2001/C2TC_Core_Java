class parentAge{
	int age = 38;
	void print_age() {
		System.out.println("Parent's Age is " + age );
	}
}

class Child1 extends parentAge{
	int age1 = 20;
	void differenceInAge() {
		System.out.println("Difference in age with 1st child " + (age - age1));
	}
}

class Child2 extends parentAge{
	int age2 = 14;
	void differenceInAge() {
		System.out.println("Difference in age with 2nd child " + (age - age2));
	}
}

public class Hierarchical3 {

	public static void main(String[] args) {
		Child1 c1 =new Child1();
		c1.print_age();
		c1.differenceInAge();
		
		Child2 c2 =new Child2();
		c2.print_age();
		c2.differenceInAge();
	}

}
