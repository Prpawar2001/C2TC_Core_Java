
public class Parameterised_Constructor {
	int age;
	String name;
	
	public Parameterised_Constructor(int a, String b)
	{
		age=a;
		name=b;
	}

	public static void main(String[] args) {
		Parameterised_Constructor pc1 = new Parameterised_Constructor(10,"Ram");
		Parameterised_Constructor pc2 = new Parameterised_Constructor(15,"Sham");
		
		System.out.println(pc1.name +"'s age is " + pc1.age);
		System.out.println(pc2.name +"'s age is " + pc2.age);
	}

}
