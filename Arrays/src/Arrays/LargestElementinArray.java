package Arrays;

public class LargestElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr= {44,55,72,51,18};
			int large=arr[0];
			for(int i=1;i<arr.length;i++) {
				 if(arr[i]>large) {
					 large=arr[i];
				}
				
			}
			System.out.println("Largest Num = "+large);
			 
	}

}
