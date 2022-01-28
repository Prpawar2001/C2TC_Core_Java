import java.util.Scanner;

public class Nested_if_else {

	public static void main(String[] args) {
		int a,b,c;
		System.out.print("Enter two number:-");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.print("What action you want to perform ? /n 1.Sum /n 2.Difference :- ");
		c=sc.nextInt();
		
		if(c==1)
		{
			System.out.println("Sum is" + (a + b));
		}
		else if(c==2)
		{
			if(a>b)
			{
				System.out.println("Difference is " + (a - b));
			}
			else
			{
				System.out.println("Difference is " + (b - a));
			}
		}
		else
		{
			System.out.println("Please select correct operation");
		}
	}

}
