import java.util.Scanner;

public class For_loop {

	public static void main(String[] args) {
		System.out.print("Enter a number:- ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int ans=0;
		
		for(int i=0;i<=a;i++)
		{
			ans=ans+i;
		}
		System.out.println(ans);		
	}
}