package Arrays;

public class PimeNO {
 

	public static boolean PrimeinRange(int n) {
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		System.out.println();
		return true;
	}
	public static void main(String[] args) {
	 
	 PrimeinRange(12);
	}

}
