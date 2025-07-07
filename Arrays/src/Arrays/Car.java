package Arrays;

public class Car {
	String name;
	double price;
	
	public Car(String name,double price) {
		this.name=name;
		this.price=price;
		 
	}
	void display() {
		System.out.println("Car Name :"+name);
		System.out.println("Car Price :"+price);
		System.out.println();
	}
 

}
