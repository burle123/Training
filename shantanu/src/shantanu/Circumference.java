package shantanu;
import java.util.*;
public class Circumference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the Radius: ");
		double radius = sc.nextDouble();
		double circum;
		circum = 2*Math.PI*radius;
		System.out.println("The circumference of circle is: " + circum);
	}
}