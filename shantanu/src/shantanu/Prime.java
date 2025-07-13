package shantanu;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num to check : ");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println("Number is Prime!!!");
		}
		else {
			System.out.println("Number is not Prime!!!");
		}
	}

}
