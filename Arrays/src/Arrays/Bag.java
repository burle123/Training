package Arrays;
import java.util.*;
public class Bag {
	String brand;
	int price;
	Laptop L;
	Bag(String brand,int price){
		this.brand=brand;
		this.price=price;
		System.out.println("Bag is Created!!!");
	}
	
	void addLaptop() {
		if(L==null) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Laptop Name: ");
			String name=sc.next();
			System.out.println("Enter Laptop Price: ");
			double price=sc.nextDouble();
			
			Laptop L=new Laptop(name,price);
			System.out.println("Laptop Added!!!");
		}
	}
	
	void removeLaptop() {
		if(L==null) {
			System.out.println("The Bag is empty plz add laptop !");
		}
		else {
			L=null;
			System.out.println("Laptop Removed Successfully!!!");
		}
	}
	
	void displayLaptop() {
		if(L==null) {
			System.out.println("The Bag is empty plz add laptop !");
		}
		else {
			System.out.println("Laptop Name = "+L.name);
			System.out.println("Laptop Price = "+price);
		}
	}
	
	void displayBag() {
		System.out.println("Bag Brand = "+brand);
		System.out.println("Bag Price = "+price);
	}
}
