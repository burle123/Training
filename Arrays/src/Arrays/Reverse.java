package Arrays;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=38254;
		int rev=0;
		
		while(number > 0) {
			
			int lastdigit = number%10;
			rev=rev*10+lastdigit;
			number = number / 10;
		}
		System.out.println("Reverse Number ="+rev);
	}

}
