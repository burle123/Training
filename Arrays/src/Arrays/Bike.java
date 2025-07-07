package Arrays;

public class Bike {
	String name;
	double price;
	
	public Bike(String name,double price) {
		this.name=name;
		this.price=price;
		System.out.println("Bike Created!");
	}
	void display() {
		System.out.println("Bike Name :"+name);
		System.out.println("Bike Price :"+price);
		System.out.println();
	}
}
