package Arrays;
import java.util.*;
public class subarray {
		
	public static void SubArray(int numbers[]) {
		int total_sa=0;
		for (int i=0;i<numbers.length;i++) {
			int start=i;
			for(int j=i; j<numbers.length;j++) {
				int end=j;
				for(int k=start;k<=end;k++) {
					System.out.println(numbers[k]+" ");
					
				}
				total_sa++;
				System.out.println();
			}
			System.out.println();
		}
	
		System.out.println();
		System.out.println("Toatal Sub Arrays = " + total_sa);

	}
	
		
	
	public static void main(String args[]) {
		int numbers[]= {1,3,5,7,8,5,4};
		SubArray(numbers);
	}
	
}
