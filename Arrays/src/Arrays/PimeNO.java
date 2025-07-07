package Arrays;
import java.util.*;
//import java.lang.*;

public class PimeNO {
 

	public static void PrimeinRange(int n) {
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i+" ");
			}
		}
		
		System.out.println();
	}
	public static void main(String[] args) {
	 
	 PrimeinRange(12);
	}

}
