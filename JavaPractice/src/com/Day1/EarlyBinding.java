package com.Day1;

public enum EarlyBinding {

} 

 

  class Car {
		String name;
		double price;
		
		Engine1 e1=new Engine1("Toyota",2000);
		Engine2 e2=new Engine2("Tata",1500);
		 
		
		  Car(String name,double price) {
			this.name=name;
			this.price=price;
 
		}
		
		void display() {
			
			System.out.println("Car name :"+name);
			System.out.println("Car price :"+price);
			System.out.println();
		}
		 
}
 

  class Engine1 {

	 String brand;
	 int cc;
	 
	 public Engine1(String brand,int cc) {
		 this.brand=brand;
		 this.cc=cc;
		
	 }
	 public void display() {
		 System.out.println("Engine 1 Created!");
		 System.out.println("Engine 1 brand :"+brand);
		 System.out.println("CC :"+cc);
		  
	 }

}


 

public class Engine2 extends Engine1{

	 String brand;
	 int cc;
	  public Engine2(String brand,int cc) {
		 this.brand=brand;
		 this.cc=cc;
		 
	 }
	 public void display() {
		 System.out.println("Engine 2 Created!");
		 System.out.println("Engine 2 brand :"+brand);
		 System.out.println("CC :"+cc);
		  
	 }

}
