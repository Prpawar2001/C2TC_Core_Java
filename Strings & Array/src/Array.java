
public class Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,10};
		int b[]= {4,2,3,5,1,6,7,9,8};
		int c[]= new int[a.length];

		for(int i=0;i<a.length;i++) {
			c[i]=a[i]+b[i];
			System.out.print(c[i]+" ");
		}
	}

}
