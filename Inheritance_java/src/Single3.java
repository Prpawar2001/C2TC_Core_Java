class Shape {
	void perimeter(int a, int b) {
		System.out.println("Perimeter is " + 2*(a + b));
	}
}

class Rectangle extends Shape{
	void rectarea(int a, int b) {
		System.out.println("Area of rectangle is " + a * b);
	}
}
public class Single3 {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.perimeter(5,4);
		rect.rectarea(5,4);
	}

}