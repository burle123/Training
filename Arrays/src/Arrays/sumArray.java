package Arrays;

public class sumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={8,5,2,6,4,7,3};
		int sum=0;
		
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of array elemnts: "+sum);
	}

}
