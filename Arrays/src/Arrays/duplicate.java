package Arrays;
import java.util.*;
public class duplicate {

	public static void main(String args[]) {
		
		int[] arr= {1,2,3,5,6,43,2,11,3,5,8,9,9,0};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
