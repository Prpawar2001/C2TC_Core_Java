import java.util.ArrayList;

public class For_Each {

	public static void main(String[] args) {
		int numbers[]= {10,20,30,40,50,60};
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("abc");
		l.add("pqr");
		l.add("xyz");
		
		for(String a:l)
		{
			System.out.println(a);
		}

	}

}
