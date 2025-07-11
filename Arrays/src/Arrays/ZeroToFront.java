package Arrays;

public class ZeroToFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,0,5,7,8,3,0,3,5};
		
		int[] result= new int[arr.length];
		
		int zeroCount=0;
		for(int num:arr) {
			if(num==0) {
				zeroCount++;
			}
			for(int i=0;i<zeroCount;i++) {
				result[i]=0;
			}
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0) {
					result[zeroCount]=arr[i];
					zeroCount++;
				}
			}
			for(int k:result) {
				System.out.print(k);;
			}
		}
	}

}
