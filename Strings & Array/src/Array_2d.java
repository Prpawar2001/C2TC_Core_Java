
public class Array_2d {

	public static void main(String[] args) {
		int a[][] = new int[4][4];
		int x=1;
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				a[i][j]= x;
				System.out.print(x + " ");
				x++;
				if(x==10)
				{
					x=1;
				}				
			}
			System.out.print("\n");
		}

	}

}
