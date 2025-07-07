package Arrays;
import java.util.*;
public class LaptopBag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag b=new Bag("Skybags",5000);
		
		
		for(;;) {
			Scanner sc=new Scanner (System.in);
			System.out.println("1.add 2.remove 3.displayLaptop 4.displayBag 5.exit");
			switch(sc.nextInt()) {
			case 1:
				b.addLaptop();
				break;
			case 2:
				b.removeLaptop();
				break;
			case 3:
				b.displayLaptop();
				break;
			case 4:
				b.displayBag();
				break;
			 default:
				 System.out.println("Enter valid choice !");
			}
		}
	}

}
