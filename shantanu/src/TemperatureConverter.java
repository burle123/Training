import java.util.*;
public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in celcius :");
		double celcius=sc.nextDouble();
		
		double fahren=(celcius*9/5)+32;
		System.out.println(fahren);
		
		
		System.out.println("Enter temperature in fahren :");
		double fahrenit=sc.nextDouble();
		
		double cel=(fahrenit-32)*5/9;
		System.out.println(cel);
	}

}
