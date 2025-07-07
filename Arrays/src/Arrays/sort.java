/**
 * 
 */
package Arrays;
import java.util.*;
/**
 * 
 */
public class sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr=new int[3];
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		System.out.println(arr[0]);
		
		int[] arr = {1,4,2,5,7};
		
		
		for(int i=0;i<=arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {							//Assending
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
				
		
//		for(int i=0;i<=arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {							//Desending
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		System.out.println(Arrays.toString(arr));
	}

}
