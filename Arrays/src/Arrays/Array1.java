package Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {4,5,6,8,2,9};
			int largest=arr[0];
			for(int i:arr) {
				if(i >largest) {
					largest=arr[i];
				}
			}
			System.out.println("Largest number = "+largest);
	}

}
