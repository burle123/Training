package Arrays;
import java.util.*;
public class TotalBillSplitting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Total Amount of Bill =");
		double total=sc.nextInt();
		
		System.out.println("Total People =");
		int people=sc.nextInt();
		
		double split=total/people;
		
		System.out.println("Contri per people = "+split);
		}
		

	}


