package Arrays;
import java.util.*;
public class palindrome{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter any number to check :");
		int num=sc.nextInt();
		int og=num;
		int rev=0;
		while(num!=0) {
			int last=num%10;
			
			rev=(rev*10)+last;
			num=num/10;
		}
		if(og==rev) {
			System.out.println("Number is Palindrome Number");
		}
		else {
			System.out.println("Number is not Palindrome Number");
		}
	}

}
