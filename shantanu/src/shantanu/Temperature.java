package shantanu;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Celcius to Fahrenheit");
		System.out.println("1.Fahrenheit to Celcius");
		int choice=sc.nextInt();
		for(;;) {
		switch(choice) {
		case 1:
			System.out.println("Enter the Celcius Value : ");
			double cel=sc.nextDouble();
			double far=(cel*9/5)+30;
			System.out.println("Fahrenheit = "+far);
			break;
			
		case 2:
			System.out.println("Enter the Fahrenheit Value : ");
			  far=sc.nextDouble();
			  cel=(far-32)*5/9;
			System.out.println("Celcius = "+cel);
			break;	
		}
		
	}
	}

}
