package Arrays;
import java.util.*;
public class FibbonnacciusingRecursion {
	
	public static int fibonnacci(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else
			return fibonnacci(n-1)+fibonnacci(n-2);
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n number :");
		int n=sc.nextInt();
		System.out.println("Fibbonnacci Series using FRecursion :");
		for(int i=1;i<=n;i++) {
			System.out.println(fibonnacci(i)+" ");
		}
		
	}
}
