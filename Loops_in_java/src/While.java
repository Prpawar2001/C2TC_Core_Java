import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int a,ans=1;
		System.out.print("Enter your number:- ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		while(a>0)
		{
			ans = ans * a;
			a=a-1;
		}
		System.out.println("Factorial is " + ans);
	}

}
