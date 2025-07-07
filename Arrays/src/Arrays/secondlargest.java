package Arrays;

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {4,5,6,8,2,9};
			int largest=arr[0];
			int secondlargest=arr[0];
			 for (int i = 0; i < arr.length; i++) {
		            if (arr[i] > secondlargest && arr[i] < largest) {
		                secondlargest = arr[i];
		            }
		        }
			System.out.println("Largest number = "+secondlargest);
	}

}
