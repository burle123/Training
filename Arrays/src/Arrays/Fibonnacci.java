package Arrays;

public class Fibonnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int first=0;
		int second=1;
		
		System.out.println("Fibbonnaci series of "+n+ " terms :");
		
		for(int i=1;i<=n;i++) {
			 System.out.print(first +" ");
			 int next=first+second;
		
			 first=second;
			 second=next;
			
		 
		}
		
	}

}
