import java.util.Scanner;
public class Switch_case {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		switch(a) {
		
			default:System.out.println("default");
			break;
			
			case 1:System.out.println("case 1");
			break;
			
			case 2:System.out.println("case 2");
			break;
			
			case 3:System.out.println("case 3");
		
		}
	}

}
