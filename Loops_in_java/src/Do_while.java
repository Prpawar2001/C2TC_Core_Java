
public class Do_while {

	public static void main(String[] args) {
		int a=5;
		int ans=a;
				
		do {
			a=a-1;
			ans=ans*a;
		}while(a>1);
		
		System.out.println(ans);
	}
}