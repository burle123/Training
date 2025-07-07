package com.Day1;

public class HarshadNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=22;
		int sum=0;
		int og=n;
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		if(og%sum==0) {
			System.out.println("Harshad Number!!!");
		}
		else {
			System.out.println("Not a Harshad Number!!!");
		}
	}

}
