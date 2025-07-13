package shantanu;
import java.util.*;
public class TriangleCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Triangle side a : ");
		int a=sc.nextInt();
		System.out.println("Enter the value of  Triangle side b: ");
		int b=sc.nextInt();
		System.out.println("Enter the value of Triangle side c : ");
		int c=sc.nextInt();
		
		if(a+b>c && b+c>a && a+c>b) {
			System.out.println("Triangle is Valid");
		}
		else {
			System.out.println("Triangle is not Valid");
		}
		}

}
