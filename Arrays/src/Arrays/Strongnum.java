package Arrays;
import java.util.*;
public class Strongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		int og=num;
		int sum=0;
		while(num!=0) {
			int last=num%10;
			int fact=1;
			
			for(int i=1;i<=last;i++) {
			fact*=i;	
			}
		
		sum=sum+fact;
		num=num/10;
		 
		}	
		
		if(og==sum) {
			System.out.println("Strong NUmber");
		}
		else {
			System.out.println("Not a Strong Number");
		}
	}

}
