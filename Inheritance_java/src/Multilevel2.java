class A{
	int salary = 50000;	
	void salary() {
		System.out.println("Salary is " + salary);
	}
}

class B extends A{
	int bonus = 20000;
	void bonus() {	
		System.out.println("Salary is " + salary);
		System.out.println("Bonus is " + bonus);
	}
}

class C extends B{
	void totalPayment() {
		System.out.println("Total Payment is " + ((salary * 12) + bonus) );
	}
}
public class Multilevel2 {

	public static void main(String[] args) {
		C obj = new C();
		obj.salary();
		obj.bonus();
		obj.totalPayment();
	}
}