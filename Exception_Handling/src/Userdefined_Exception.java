import java.util.Scanner;
public class Userdefined_Exception {

	public static void main(String[] args) {
		
		System.out.println("Check you are eligible for Certification on not ");
		
		int total = 50;
		System.out.println("How many sessions you attended ?");
		Scanner sc = new Scanner(System.in);
		int att = sc.nextInt();
		
		if(att>total) {
			throw new user("Check your entered number is greater than sessions done");
		}
		else
		{
			System.out.println("Your attendance is " + att*100/total);
		}
	}
}

class user extends RuntimeException{


	user(String msg)
	{
		super(msg);
	}
}