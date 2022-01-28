import java.util.Scanner;
public class tryCatch extends Exception {

	tryCatch(String str,String a){
		super(str);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		int studentId[]= {101,102,103,104};
		String name[] = {"Amey","Ajeet","Ram","om"};
		int fees[] = {11000,26000,50000,46600};
		final int TotalFee = 80000;
		int n=studentId.length;
		int bal[] = new int[n];
			
		System.out.print("Try....Catch....Finally...." + "\n");
		
		try {
			
			for(int i=0;i<studentId.length;i++) {
				bal[i]=TotalFee - fees[i];
				
			if(bal[i] < (TotalFee/2))
			{
				System.out.println(studentId[i] + "\t" + name[i] + "\t" + bal[i]);
				tryCatch tc = new tryCatch("Please pay atlest 40000 fee",name[i]);
				throw tc;
			}
			else {
				System.out.println(studentId[i] + "\t" + name[i] + "\t" + bal[i]);
			}
			}
		}
		catch(tryCatch e) {
			e.printStackTrace();
		}
	}
}