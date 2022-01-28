import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter largest side of triangle");
		c=sc.nextInt();
		System.out.println("Enter side 1 of triangle");
		a=sc.nextInt();
		System.out.println("Enter side 2 of triangle");
		b=sc.nextInt();
		
		
		if((a*a + b*b) == c*c)
		{
			System.out.println("It is Right angled triangle");
		}else
		{
			System.out.println("It is not Right angled triangle");
		}
	}

}
