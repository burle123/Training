package shantanu;
import java.util.*;
public class ArmStormNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int n=sc.nextInt();
		int sum=0;
		int og=n;
		while(n>0) {
			int rem=n%10;
			sum=sum+(rem*rem*rem*rem);
			n=n/10;
		}
		if(og==sum) {
			System.out.println("ArmStrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}

}
