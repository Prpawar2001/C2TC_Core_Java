//class Chai{
//	Chai(){
//		this(5);
//		System.out.println("This is Default constructor");
//	}
//	Chai(int x){
//		this(5,15);
//		System.out.println(x);
//	}
//	Chai(int i,int j){
//		System.out.println(i*j);
//	}
//}
public class Constructor_Chaining {

	public static void main(String[] args) {
		new Chill("a");

	}

}

class Ball{
	String name;
	
	Ball(){
		this("");
		System.out.println("No arg in B");
	}
	Ball(String name){
		this.name=name;
		System.out.println("arg in B");
	}
}

class Chill extends Ball{
	
	Chill(){
		System.out.println("No arg in C");
	}
	Chill(String name){
		super(name);
		System.out.println("arg in C");
	}
}