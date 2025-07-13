package shantanu;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vslue of a : ");
		int a=sc.nextInt();
		System.out.println("Enter the vslue of b : ");
		int b=sc.nextInt();
		for(;;) {
		System.out.println("Enter you choice from this(+,-,*,/)");
		char op=sc.next().charAt(0);
		double result;
		if(op=='+') {
			result=a+b;
			System.out.println("Addition = "+result);
		}
		else if(op=='-') {
			result=a-b;
			System.out.println("Substraction = "+result);
		}
		else if(op=='*') {
			result=a*b;
			System.out.println("Multiplication = "+result);
		}
		else if(op=='/') {
			result=a/b;
			System.out.println("Division = "+result);
		}
		else {
			System.out.println("Enter valid Operation symbol!!");
		}
	}
	}

}
