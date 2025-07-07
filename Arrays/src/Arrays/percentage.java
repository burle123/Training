package Arrays;
import java.util.*;
public class percentage {

	public static void main(String[] args) {
		
		int[] marks= new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks:");
		marks[0]=sc.nextInt();
		marks[1]=sc.nextInt();
		marks[2]=sc.nextInt();
		marks[3]=sc.nextInt();
		marks[4]=sc.nextInt();
		marks[5]=sc.nextInt();
		
		System.out.println("Phy:"+marks[0]);
		System.out.println("Che:"+marks[1]);
		System.out.println("Maths:"+marks[2]);
		System.out.println("Python:"+marks[3]);
		System.out.println("Java:"+marks[4]);
		System.out.println("Dbms:"+marks[5]);
		
		int percentage=(marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5])/6;
		
		System.out.println("Percentage ="+percentage+ "%");
	}

}
