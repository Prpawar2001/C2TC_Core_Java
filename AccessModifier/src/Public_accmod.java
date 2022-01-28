class Example1{
	
	void access_method(){
		Public_accmod pub = new Public_accmod();
		pub.anywhere();
	}
}
public class Public_accmod {

	public static void main(String[] args) {
		
		Example1 e1 =new Example1();
		e1.access_method();
	}
	
	public void anywhere()
	{
		System.out.println("We cam access this method anywhere in this folder"); 
//		if we want to access in different project we can import this package in that project
	}

}
