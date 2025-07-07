package Arrays;

public class Functionoverloading {
	
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	public static float sum(float a,float b) {
		return a+b;
	}
	public static float sum(float a,float b,float c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(1,4));
		System.out.println(sum(1,4,3));
		System.out.println(sum(1.2f,4.3f));
		System.out.println(sum(1.5f,4.3f,3.2f));

	}

}
