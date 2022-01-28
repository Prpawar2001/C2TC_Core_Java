class Calculation {
	int ans;
	
	void add(int x, int y) {
		ans = x + y;
		System.out.println("Addition is: " + ans);
	}
}

class Test extends Calculation {
	void substract(int x, int y) {
		ans = x - y;
		System.out.println("Substraction is: " + ans);
	}
}

public class Single1 {

	public static void main(String[] args) {
		Test t = new Test();
		t.substract(10, 5);
		t.add(10, 5);
	}
}