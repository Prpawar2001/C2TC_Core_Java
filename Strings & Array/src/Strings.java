import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		
		String a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name:-");
		a=sc.nextLine();
		System.out.print("Enter father name:-");
		b=sc.nextLine();
		System.out.print("Enter Surname:-");
		c=sc.nextLine();
		
		System.out.println(c +" " + a+ " " + b);
		System.out.println(c.length() +" " + a.length()+ " " + b.length());
		System.out.println(a.charAt(0));
		System.out.println(a.substring(2));
		System.out.println(a.substring(2, 4));
	}
}