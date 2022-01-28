class H1{
	int a = 10 , b = 5;
}

class H2 extends H1{
	void square() {
		System.out.println("Squares are " + a*a +" & "+ b*b);
	}
}

class H3 extends H1{
	void cube() {
		System.out.println("Cubes are " + a*a*a +" & "+ b*b*b);
	}
}

public class Hierarchical2 {

	public static void main(String[] args) {
		H2 x = new H2();
		x.square();
		H3 y = new H3();
		y.cube();
	}

}
