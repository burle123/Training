package Arrays;
import java.util.*;
public class spynum{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int msum=1;
		int asum=0;
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		while(num!=0) {
		int last=num%10;
		msum*=last;
		asum+=last;
		num=num/10;
		
		}
		
		if(msum==asum) {
			System.out.println("Spy Number");
		}
		else {
			System.out.println("Not a Spy Number");
		}
	}

}
